package PrTest;

public class DuplicateWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Big black big bug big dog black";
		String strl=str.toLowerCase();
		String [] a=strl.split(" ");
		
		int count;
		
		for (int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
					a[j]="0";				
				}
			}
			if(count>1&&a[i]!="0")
			{
				System.out.println(a[i]+" and count is "+count);
			}
		}
	}
}
