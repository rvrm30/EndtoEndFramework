Feature: Validating Place API's
@AddPlace @Regression
Scenario Outline: Verify Place is succssfully added using Add place API
 	Given Add Place Payload with "<name>" "<language>" "<address>"
 	When user calls "AddPlaceAPI" using "POST" http request
 	Then API calls is success with status code 200
 	And "status" in response body is "OK"
 	And "scope" in response body is "APP"
 	And verify place_Id create maps to "<name>" using "getPlaceAPI"
 	
Examples:
   |  name |language |    address				 |
   |DDhouse| Arabic  | World cross cemtre|
 # |BBhouse| Spanish | India cross cemtre|
   
@DeletePlace @Regression
Scenario: Verify if Delete Place functionality is working 
 Given DeletePlace Payload
 When user calls "deletePlaceAPI" using "POST" http request
 Then API calls is success with status code 200
 And "status" in response body is "OK"
