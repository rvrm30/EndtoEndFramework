package PrTest;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Riya Vermaa";
		String nm=name.toLowerCase();
		char [] a=nm.toCharArray();
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length; j++)
			{
				if(a[i]==a[j] && a[i] !=' ');
				{ 
					System.out.println(a[i]);
					break;
				}
				
			}
		}
	}
}


