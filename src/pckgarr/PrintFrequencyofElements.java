package pckgarr;

import java.util.HashMap;
import java.util.Map;

public class PrintFrequencyofElements {
	
	public static void printFreqencies(int [] arr)
	{
		 HashMap<Integer, Integer> hm = new HashMap<>();
		 
		 for(int i=0;i<arr.length;i++)	
		 {
			 hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
			 
		 }
		 
		 for(Map.Entry x:hm.entrySet())
		 {
			 System.out.println(x.getKey()+" "+x.getValue());
		 }
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[] = new int[]{10,8,10,8};
	    printFreqencies(arr);

}
}
