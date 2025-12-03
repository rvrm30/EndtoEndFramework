package PrTest;

public class TotalNoofCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Riya Verma";
		int charcount=0;
		
		for(int i=0;i<=name.length()-1;i++)
		{
			if(name.charAt(i)!=' ')
			{
				charcount++;				
			}
		}
		System.out.println("Character count="+charcount);
		

	}

}
