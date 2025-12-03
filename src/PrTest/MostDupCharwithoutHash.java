package PrTest;

public class MostDupCharwithoutHash {
	public static void main(String[] args)
	{
	 String str = "grass is greener on the other side";  
     int[] freq = new int[str.length()];  
     char minChar = str.charAt(0), maxChar = str.charAt(0);  
     int i, j, min, max;          
     
     //Converts given string into character array  
     char c[] = str.toCharArray();  
        
     //Count each word in given string and store in array freq  
     for(i = 0; i < c.length; i++) {  
         freq[i] = 1;  
         for(j = i+1; j < c.length; j++) {  
             if(c[i] == c[j] && c[i] != ' ' && c[i] != '0') {  
                 freq[i]++;    //Set c[j] to 0 to avoid printing visited character  
                 c[j] = '0';  
             }  
             
         }  
     }  
       
     //Determine minimum and maximum occurring characters  
     min = max = freq[0];  
    
     for(i = 0; i <freq.length; i++) {  
           
         //If min is greater than frequency of a character   
         //then, store frequency in min and corresponding character in minChar  
         if(min > freq[i] && freq[i] != '0') {  
             min = freq[i];  
             minChar = c[i];  
         }  
         //If max is less than frequency of a character   
         //then, store frequency in max and corresponding character in maxChar  
         if(max < freq[i]) {  
             max = freq[i];  
             maxChar = c[i];  
         }  
     }  
       
     System.out.println("Minimum occurring character: " + minChar);  
     System.out.println("Maximum occurring character: " + maxChar);
	}
}
