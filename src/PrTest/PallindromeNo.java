package PrTest;

public class PallindromeNo {
	
	public static void main( String args [])
	{
		int r, sum=0, temp;
		int num=454;		
		temp=num;
		
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;		
		}	
		if (temp==sum)
		{
			System.out.println("Num is a Pallindrom ="+temp);
		}
		else
		{
			System.out.println("Num not Pallindrom ="+temp);
		}
	}

}
