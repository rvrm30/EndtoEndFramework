package PrTest;

import java.util.ArrayList;

public class ArraySegregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] s = {"apple", "orange", "banana", "goa"};

		
	        ArrayList<String> s1=new ArrayList<>();
	        ArrayList<String> s2=new ArrayList<>();
	        
	        for(int i=0;i<s.length;i++)
	        { String name= s[i];
	            if(name.charAt(name.length()-1)=='e')
	            {
	                s1.add(name);
	            }
	            else if(name.charAt(name.length()-1)=='a')
	            {
	                s2.add(name);
	            }
	        }
	        System.out.println("Array ending with e");
	        for(String str:s1)
	        {
	            System.out.println(str);
	        }
	        System.out.println("Array ending with a");
	        for(String str:s2)
	        {
	            System.out.println(str);
	        }
	        
	}

}
