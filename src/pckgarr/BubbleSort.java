package pckgarr;

public class BubbleSort {
	 public static void main(String[] args) {
	        // Sample array
	        int[] arr = {64, 34, 25, 12, 22, 11, 90};

	        // Call bubbleSort function
	        bubbleSort(arr);

	        // Print sorted array
	        System.out.println("Sorted array in ascending order:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	    // Bubble sort method
	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        System.out.println(n);

	        // Outer loop for the number of passes
	        for (int i = 0; i < n - 1; i++) {
	            // Inner loop for comparing adjacent elements
	            for (int j = 0; j < n - i - 1; j++) {
	                // Swap if the element is greater than the next element
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
}
