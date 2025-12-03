package PrTest;

public class FirstletterUppercase {
	
	public static void main(String args[])
	{
		String a="riya verma ambition"; 
		String b[]=a.split(" ");
		int count=0;
		
//		String obj=new String("aditya");
//		System.out.println(obj);
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=b[i].substring(0,1).toUpperCase()+b[i].substring(1);		
			count ++;
		}
		
		a=String.join(" ", b);
		System.out.println(a);
		System.out.print(count);
				
	}

}
