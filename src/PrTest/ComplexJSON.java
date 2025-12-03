package PrTest;

import Files.Payload;
import io.restassured.path.json.JsonPath;


public class ComplexJSON {

	public static void main(String[] args) {

		
		JsonPath js2=new JsonPath(Payload.ComplexAPIRESPONSE());
		
        int coursescount= js2.getInt("courses.size()");
		//System.out.println(coursescount);
		
		int purchaseamt=js2.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseamt);
		
//	String firstcoursetitle=js2.get("courses[0].title");
//		System.out.println(firstcoursetitle);
		int sum=0;
 		for(int i=0;i<coursescount;i++) 
	    {
 			//System.out.println(js2.get("courses["+i+"].title").toString());
 		String coursetitle=js2.get("courses["+i+"].title");
 		int actualprice=js2.get("courses["+i+"].price");
 		int actualcopies=js2.get("courses["+i+"].copies");
 		int actualpurchasedamt=actualprice*actualcopies;
 		
 		sum=sum+actualpurchasedamt;
 		

// 		if(coursetitle.equalsIgnoreCase("RPA"))
// 		{
// 			System.out.println(js2.get("courses["+i+"].copies").toString());
// 			break;
// 			
// 		}
 		
    	}
 		System.out.println(sum);
 		
 		if(sum==purchaseamt)
 		{
 			System.out.println("Sum of all Course prices is matching with Purchase Amount");
 		}
 		else
		{
 			System.out.println("Sum of all Course prices is not matching with Purchase Amount");
 		}

	}

}
