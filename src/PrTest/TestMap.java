package PrTest;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) 
	{
		Map map= new HashMap();
		map.put(101, "Riya");
		map.put(103, "Aditya");
		map.put(102, "Aditya");
		map.put(null, null);
		
		//map.clear();
		//System.out.println(map.containsKey(101));
		//System.out.println(map.containsValue("Riya"));
		
		//System.out.println(map);
		
		HashMap<Integer, String> hm =new HashMap<Integer, String>();
		
		hm.put(101, "Riya");
		hm.put(102, "Aditya");
		System.out.println(hm.get(101));
		System.out.println(hm.getOrDefault(105, "Verma"));
		
	}

}
