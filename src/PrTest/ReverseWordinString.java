package PrTest;

public class ReverseWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My name is Riya Verma"; 
		String words []=str.split(" ");
		String reversedString="";
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord + word.charAt(j);
				System.out.print(word.charAt(j));
			}
			
			
			reversedString=reversedString + reverseWord + " ";				
		}
	
		

	}
	
	

}
