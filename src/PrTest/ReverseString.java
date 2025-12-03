package PrTest;

public class ReverseString {

	public static void main(String args[])
	{
		String a="My name is Riya Verma"; 
		// Reverse complete string
		char[] x=a.toCharArray();
		
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.print(x[i]);
		}	
		
//		String str="w";
//        String temp="";
//        
//        for(int i=str.length()-1;i>=0;i--)
//        {
//            temp=temp+str.charAt(i);
//        }
//        System.out.println(temp);
		
		//Revere word of string
		String y[] =a.split(" ");
		String c="";

		for(int j=y.length-1;j>=0;j--)
		{
			c=c+y[j]+" ";
		}
		System.out.println("");
		System.out.print(c.trim());
	
		//Revere character of string
		String nm="My name is Riya Verma";
		String r="";
		
		for (int i=nm.length()-1;i>=0;i--)
		{
			r=r+nm.charAt(i);
		}
		System.out.println("");
		System.out.print(r);
		
//		  String str="My name is Riya Verma";
//	        String s[]=str.split(" ");
//	        
//	        for(int i=s.length-1;i>=0;i--)	        	
//	        {
//	        System.out.print(s[i]+" ");
//	        }
	}
}
