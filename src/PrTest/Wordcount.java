package PrTest;

public class Wordcount {
	public static int wordCount(String str){
        if(str==null || str.trim().isEmpty()){
            return 0;
        }
        String []a=str.trim().split(" ");
        return a.length;
        
    }
    public static void main(String[] args) {
       String s="My name is riya";
       int wordcount=wordCount(s);
       System.out.println(wordcount);
    }
}
