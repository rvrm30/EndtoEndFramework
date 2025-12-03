package PrTest;

public class DuplicharinstringNew {

	public static void main(String[] args) {
	        
		String str="Riya Verma1009  ";
        char []a=str.toLowerCase().toCharArray();
        int count=0;
        
        for(int i=0;i<a.length;i++)
        {
            count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j] && a[i]!=' ')
                {
                    count++;
                    a[j]=' ';
                }
            }
            if(count>1 && a[i]!=' ')
            {
                System.out.println(a[i] + " and its count : " + count);
            }
        }
	      
	    }
}
