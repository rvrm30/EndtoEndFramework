package PrTest;

public class AllTcPractice {
	
	public static void main(String args [])
	{ 
//		//Duplicate Characters
//		String name="Riya Verma";
//		String nm=name.toLowerCase();
//		char []a=nm.toCharArray();
//		
//		for (int i=0; i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					System.out.println(a[j]);
//				}
//			}
//		}
		
		//Duplicate words
		String str="Big black big bug big dog black big";
		String str1=str.toLowerCase();
		String []b=str1.split(" ");
		int c=0;
		
		for (int i=0; i<b.length;i++)
		{ c=1;
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i].equals(b[j]))
				{ c++;
				  b[j]="0";
				  
				}
				
			}
			if(c>1&&b[i]!="0")
			{
				System.out.println(b[i]+"count is"+c);
				
			}
		}
		
		
	}

}
