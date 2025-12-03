package PrTest;
import java.util.*;
public class MostDuplicateCharacterwithHasmap {

	public static void main(String[] args) 
	{
		// using hashmap
		         String str="riyaverma";
		         HashMap<Character, Integer> mp = new HashMap<>();
		         
		        // to store length of string
		        int n = str.length();
		         
		        // to store answer
		        char ans = 0;
		         
		        // to check count of answer character is less or greater
		        // than another elements count
		        int cnt = 0;
		         
		        // traverse the string
		        for(int i = 0; i < n; i++) 
		        { // push element into map and increase its frequency
		            char c = str.charAt(i);
		            mp.put(c, mp.getOrDefault(c, 0) + 1); //getorDefault() method will fetch the corresponding value to this key, if present, and return it. If there is no such mapping, then it returns the defaultValue.
		            
		            //System.out.println(mp);
		            //System.out.println(c);		            
		            // update answer and count
		            if(cnt < mp.get(c)) //comparing old freq with new frequency
		            {
		                ans = c; //store key i.e alphabet
		                cnt = mp.get(c); //store value i.e frequency 
		            }
		        } 
		        System.out.println("Most Duplicate Character =" + ans);
		    }
	}


