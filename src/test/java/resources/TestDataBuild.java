package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;

public class TestDataBuild 
{
	public AddPlace addPlacePayload(String name,String language,String address)
	{
		pojo.AddPlace p= new pojo.AddPlace();
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setName(name);
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("http://google.com");

		List<String> myList= new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		p.setTypes(myList);

		pojo.Location l = new pojo.Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);

		p.setLocation(l);
		return p;
	}
	public String deletePlacePayload(String placeid)
	{
		return "{\r\n"
				+ "    \"place_id\":\""+placeid+"\"\r\n"
				+ "}\r\n"
				+ "";			
	}

}
