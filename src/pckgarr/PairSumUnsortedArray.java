package pckgarr;

public class PairSumUnsortedArray {

	public static boolean ispair(int[] arr, int sum) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]+arr[j]==sum)
					return true;
		
		return false;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[] = new int[]{3,2,8,15,-8};
	    int sum=17;
	    boolean status=ispair(arr,sum);
	    System.out.println(status);
}
}

	