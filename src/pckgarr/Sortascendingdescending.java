package pckgarr;

import java.util.Arrays;

import java.util.Collections;

public class Sortascendingdescending {
	public static void main(String[] args) {
		
		 int[] arr = {2, 5, 6, 4, 1, 3, 9, 8};
	        int k = 4;

	        // Sort the first k elements in increasing order
	        Arrays.sort(arr, 0, k);

	        // Sort the last k elements in decreasing order
	        Integer[] lastK = new Integer[k];
	        for (int i = 0; i < k; i++) {
	            lastK[i] = arr[arr.length - k + i];
	        }
	        Arrays.sort(lastK, Collections.reverseOrder());

	        // Update the array with the sorted last k elements
	        for (int i = 0; i < k; i++) {
	            arr[arr.length - k + i] = lastK[i];
	        }

	        // Print the updated array
	        System.out.println(Arrays.toString(arr));
	}
}
