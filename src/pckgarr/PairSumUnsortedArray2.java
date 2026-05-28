package pckgarr;

import java.util.HashSet;

public class PairSumUnsortedArray2 {

	public static boolean ispair(int[] arr, int sum) {
		// TODO Auto-generated method stub
	HashSet<Integer> s=new HashSet<Integer>();
	for(int i=0;i<arr.length;i++)
	{
		if(s.contains(sum-arr[i]))
		
			return true;
		else
			s.add(arr[i]);
		
	}
	return false;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[] = new int[]{3,2,8,15,-8};
	    int sum=17;
	    ispair(arr,sum);
	    boolean status=ispair(arr,sum);
	    System.out.println(status);

}
}

	