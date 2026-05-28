package pckgarr;

public class LargestAndSecondLargest {
	 public static int[] maxAnd2ndMax(int arr[]) {
	        int largest = Integer.MIN_VALUE, secondlargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondlargest = largest;
	                largest = num;
	            } else if (num > secondlargest && num < largest) {
	                secondlargest = num;
	            }
	        }

	        // If secondlargest is not updated, return [-1]
	        if (secondlargest == Integer.MIN_VALUE) {
	            return new int[]{-1};
	        } else {
	            return new int[]{largest, secondlargest}; // Return result as an array
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {56,5,23,91,26,67,42,33};

		 int[] result=maxAnd2ndMax(arr);
		 for(int num:result)
		 {
		 System.out.println(num);
		 }

	}

}
