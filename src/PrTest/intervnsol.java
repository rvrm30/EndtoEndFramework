package PrTest;
//// print frequency of each element of an array without hashmap
public class intervnsol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,1,4,2};
		int y[]=new int [a.length];		
		int v=-1;
	
		 for(int i=0;i<a.length;i++)
	        {int count=1; 
			 for(int j=i+1;j<a.length;j++)
			 { 
				 if(a[i]==a[j])
				 {
					 count++; //count=2;
					 y[j]=v; //y[3]=-1
				 } 			 
			 }
			 if(y[i]!=v)
			 
				y[i] =count;
			 
			 
	        }
		 
		 //y[]= {2,2,1,-1,1,-1}}
		 for(int i=0;i<y.length;i++)
		 { //System.out.println(y[i]);
			 if(y[i]!=v)
			 {
				 System.out.println("Frequency of integer "+a[i]+" is "+y[i]);
				 
			 }
		 }
		 
	}

}
