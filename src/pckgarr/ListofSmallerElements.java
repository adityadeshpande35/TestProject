package pckgarr;

import java.util.ArrayList;
import java.util.List;

public class ListofSmallerElements {
	public static List<Integer> getSmaller(int[] arr, int k) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		
			if(arr[i]<k)
				al.add(arr[i]);
		
		return al;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[] = new int[]{10,40,80,30,20,15};
	    List<Integer> al=getSmaller(arr,35);
	    for(Integer x:al)
	    	System.out.println(x);
	}

	
}
