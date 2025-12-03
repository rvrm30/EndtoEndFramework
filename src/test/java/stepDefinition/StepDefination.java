package stepDefinition;
import static io.restassured.RestAssured.given;
//****	Assert was not working before so we need to import static package explicitly 
import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.utils;

public class StepDefination extends utils{
	RequestSpecification res;
	ResponseSpecification respec;
	Response response;
	public static String place_id;
	TestDataBuild data=new TestDataBuild();
	
	@Given("Add Place Payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws IOException
	{
		res=given().log().all().spec(requestSpecification())
				.body(data.addPlacePayload(name,language,address));
	}
	@When("user calls {string} using {string} http request")
	public void user_calls_using_http_request(String resource, String method) 
	{	
		//Constructor will be called with Value of resource which you pass
		APIResources resourceAPI=APIResources.valueOf(resource);
		System.out.println(resourceAPI.getResource());

		if(method.equalsIgnoreCase("POST"))
			response=res.when().post(resourceAPI.getResource());
		else if(method.equalsIgnoreCase("GET"))
			response=res.when().get(resourceAPI.getResource());
	}
	@Then("API calls is success with status code {int}")
	public void api_calls_is_success_with_status_code(Integer int1)
	{
		assertEquals(response.getStatusCode(),200);
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String ExpectedValue) 
	{
		assertEquals(getJsonPath(response, keyValue),ExpectedValue);
	}

	@Then("verify place_Id create maps to {string} using {string}")
	public void verify_place_Id_create_maps_to_using(String expectedName, String resource) throws IOException 
	{
		place_id=getJsonPath(response, "place_id");
		res=given().spec(requestSpecification()).queryParam("place_id", place_id);
		user_calls_using_http_request(resource, "GET");
		String actualname=getJsonPath(response,"name");
		assertEquals(actualname,expectedName);

	}
	@Given("DeletePlace Payload")
	public void delete_place_payload() throws IOException
	{
		//no need to use pojo here since json is not complex since it have 1 key value pair
		res=given().spec(requestSpecification()).body(data.deletePlacePayload(place_id));
	}
}

