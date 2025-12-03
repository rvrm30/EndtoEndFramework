package PrTest;

import java.util.HashMap;

public class Freqofallcharacterusinghashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="jhhfiubbjjbh";
        HashMap <Character, Integer> mp= new HashMap<>();
       
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
     
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            
        }
        for(char c:mp.keySet())
        {
            System.out.println(c+" : "+mp.get(c));
        }
    
        //In the code above, the keySet() method is used to get a Set view of all the keys (characters) in the charCountMap. This allows you to iterate over each unique character stored in the map.
       //This loop goes through each character in the set of keys retrieved from the HashMap. 
        //For each character (c), it prints the character followed by its frequency (charCountMap.get(c)). It helps you access all the unique characters that have been counted and their respective frequencies.
//keySet() lets you iterate over all the distinct characters from the original string so you can display their frequencies.
        //m.keySet() returns a Set of all the keys (i.e., the unique characters) in the map.
	}

}
