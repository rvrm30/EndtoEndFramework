package stepDefinition;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks
{
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		//Execute this code only when place id is null
		//Write a code that will give you place id 
		StepDefination m=new StepDefination();
		if(StepDefination.place_id==null)
		{
			m.add_place_payload_with("Ajay","farzi","UK");
			m.user_calls_using_http_request("AddPlaceAPI", "POST");
			m.verify_place_Id_create_maps_to_using("Ajay","getPlaceAPI");	
		}
	}
}

