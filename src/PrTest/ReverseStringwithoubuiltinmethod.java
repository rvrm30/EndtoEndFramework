package PrTest;

public class ReverseStringwithoubuiltinmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="Coforge";
			char []c= str.toCharArray();
			String rev="";
			for(int i=c.length-1;i>=0;i--)
			{
			    rev=rev+c[i];
			}
			
		        System.out.println(rev);
		   }

	}


