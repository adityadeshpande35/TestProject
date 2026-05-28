package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMultiplication {
	
	 public static int[] productExceptSelf(int[] arr) {
	        
	        int n=arr.length;
	        int ans[]=new int[n];
	        int prodL=1;
	        int prodR=1;

	        for(int i=n-1;i>=0;i--)
	        {
	            ans[i]=prodR;
	            prodR=prodR*arr[i];


	        }
	          for(int i=0;i<n;i++)
	        {
	            ans[i]=ans[i]*prodL;
	            prodL=prodL*arr[i];


	        }
	return ans;
	}
	
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,4};
		
		int[] result= productExceptSelf(arr);
		System.out.println(Arrays.toString(result));
		
	}
}
