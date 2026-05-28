package pckgarr;

public class Kadnae {
	
	public static int maxSubArray(int[] nums) {

        // Initialize maximum sum with the smallest possible integer
        int maxi = Integer.MIN_VALUE;

        // Iterate over each starting index of subarrays
        for (int i = 0; i < nums.length; i++) {

            // Variable to store the sum of the current subarray
            int sum = 0;

            // Iterate over each ending index of subarrays starting from i
            for (int j = i; j < nums.length; j++) {

                // Add current element to sum
                sum += nums[j];

                // Update maximum subarray sum
                maxi = Math.max(maxi, sum);
            }
        }

        // Return the maximum subarray sum
        return maxi;
    }

	
	
	
	  public static void main(String[] args) {

	        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

	        // Create an instance of Solution class

	        int maxSum = maxSubArray(arr);

	        // Print the max subarray sum
	        System.out.println("The maximum subarray sum is: " + maxSum);
	    }
}
