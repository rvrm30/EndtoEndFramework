package PrTest;
//Reverse string with special char so that that spec char position remains same 
//and rest of the string will be reversed

public class RevStringwithSpecialCharacter {
	
	 public static void main(String[] args)
	    {
	        String str = "abcd@@efgh!!ij";
	        char[] charArray = str.toCharArray();
	 
	        System.out.println("Input string: " + str);
	        
	        reverse(charArray);
	        String revStr = new String(charArray);
	 
	        System.out.println("Output string: " + revStr);
	    }
	 
	    public static void reverse(char a[])
	    {
	        // Initialize left and right pointers
	        int r = a.length - 1, l = 0;
	 
	        // Traverse string from both ends until 'l' and 'r'
	        while (l < r) {
	            // Ignore special characters
	            if (!Character.isAlphabetic(a[l]))
	                l++;
	           
	            else if (!Character.isAlphabetic(a[r]))
	                r--;
	 
	            // Both str[l] and str[r] are not spacial
	            else {
	                char tmp = a[l]; //temp=c
	                a[l] = a[r]; // 2nd pos--h
	                a[r] = tmp; // 9th pos--a
	                l++; //l=2
	                r--; // r--9
	            }
	        }
	    }
	 
	    // Driver Code
	   
	}
