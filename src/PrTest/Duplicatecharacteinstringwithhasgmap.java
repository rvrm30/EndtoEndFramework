package PrTest;

import java.util.HashMap;
import java.util.Map;

public class Duplicatecharacteinstringwithhasgmap {
	
	 public static void main(String[] args) {
	        String input = "Adityaa Vimal";
	        findDuplicateCharacters(input);
	    }

	    public static void findDuplicateCharacters(String str) {
	        // Create a map to store character frequencies
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Convert the string to lowercase to make it case-insensitive
	        str = str.toLowerCase();

	        // Count occurrences of each character
	        for (char c : str.toCharArray()) {
	            if (c != ' '){ // Ignore spaces
	                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	            }
	        }

	        // Print duplicate characters
	        System.out.println("Duplicate characters in the string:");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " - " + entry.getValue());
	            }
	        }
	    }
	            	

}
