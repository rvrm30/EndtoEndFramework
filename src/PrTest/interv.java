package PrTest;
// print frequency of each element of an array using hashmap
import java.util.HashMap;
import java.util.*;
public class interv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int a[]={1,2,3,1};
	       // int cnt=0;
	        int e;
	       // int ans;
	        HashMap<Integer, Integer> mp= new HashMap<>();
     
	        for(int i=0;i<a.length;i++)
	        {
	           e=a[i];
	            mp.put(e,mp.getOrDefault(e,0)+1);
	        // if(cnt>mp.get(e))
	        // {
	        //     cnt=mp.get(e);
	        //     ans=e;
	        // }
//	     mp   
//	     1=2;
//	     2=1
//	     3=1   
	           
	        }
	           System.out.println(mp);
	        

	}

}
