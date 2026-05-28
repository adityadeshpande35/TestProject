package pckgarr;

import java.util.ArrayList;

public class ArrayValueEqualIndex {
	
	
		
		public static ArrayList<Integer> valueEqualToIndex(int arr[]) {
	        // code here
			int n=arr.length;
	        ArrayList<Integer> res=new    ArrayList<Integer>();
	        int i=1;
	        for(int x:arr)
	        {
	            if(x==i)
	            {
	                res.add(x);
	            }
	            i++;
	        }
	        System.out.println(res);
	        return res;
	    }
	
	
	public static void main(String[] args) {
		int arr[]= {15, 2, 45, 12, 5,34,7};
		valueEqualToIndex(arr);
		
		
	}

	
}
