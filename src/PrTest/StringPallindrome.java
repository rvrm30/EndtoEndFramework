package PrTest;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="Madam";
		String b="";
//		char []arr=name.toCharArray();
		
//		for(char c:arr)
//		{
//			b=b+c;
//		}
//		
		for(int i=name.length()-1;i>=0;i--)
		{
			b=b+name.charAt(i);
		}
		if(name.equalsIgnoreCase(b))
		{
			System.out.println("Name is Pallindrome");
		}
		else		
			System.out.println("Name is not a Pallindrome");
			
			

	}

}
