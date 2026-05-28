package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	
	public  static int[] findTwoSum(int[] arr, int target) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			int extra=target-arr[i];
			if(hm.containsKey(extra))
			{
				return new int[] 
						{hm.get(extra),i};
			}
			hm.put(arr[i], i);//2:0,11:1,5:2
		}
		
		return null;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int arr[]= {2,11,5,4};
		int target=9;
		
		int result[]=findTwoSum(arr,target);
		System.out.println(Arrays.toString(result));
	}


}
