package PrTest;

public class RevComplexString {

    public static void main(String[] args) {
        String str = "My name is Aditya Vimal"; 
        String[] words = str.split("is");
        
        String[] firstHalf = words[0].trim().split(" ");
        String[] secondHalf = words[1].trim().split(" ");
         int len=firstHalf.length;
         int lent=secondHalf.length;
         
        String reversedString="";

        // Printing second half first
        for (int i = 0; i < len; i++)
        {    	
        	for(int j=lent-1;j>=0;j--)
            {
        		reversedString += secondHalf[i] +" "+ firstHalf[j]+" ";
        		i++;
            }   	            
        }
        // Adding "is" back
        reversedString += "is";

        System.out.println(reversedString);
    }
}
