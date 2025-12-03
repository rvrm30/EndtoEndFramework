package PrTest;
//Frequency of most duplicate character in string
import java.util.HashMap;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="riyavermaarrrr";
		
		HashMap <Character, Integer> mp= new HashMap <> ();
		
		int n= str.length();
		char ans=0;
		int cnt=0;
		
		for(int i=0;i<n;i++)
		{
			char c=str.charAt(i);
			mp.put(c, mp.getOrDefault(c, 0)+1);
			
			if(cnt<mp.get(c))
			{
				ans=c;
				cnt=mp.get(c);
			}
		}
		
		System.out.println("Frequency of most occuring character "+ans+" is "+cnt);
			

	}

}
