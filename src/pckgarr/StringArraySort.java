package pckgarr;

import java.util.Arrays;

public class StringArraySort {
	public static void main(String[] args) {
		
		 String[] arr = {"India", "Pakistan", "Bangladesh", "Belgium", "Brazil"};
	
	for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i-1; j++) {
            // Compare two adjacent strings
            if (arr[j].compareTo(arr[j + 1]) > 0) {
                // Swap if they are in the wrong order
                String temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
		 
		// Arrays.sort(arr);
	
	  System.out.println("Sorted array:");
      for (String country : arr) {
          System.out.println(country);
	}
}
}
