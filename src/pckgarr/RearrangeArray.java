package pckgarr;

import java.util.Arrays;

public class RearrangeArray {

	public static void rearrange(int[] arr) {
        int n = arr.length;
        
        // Temporary array to hold the result
        int[] temp = new int[n];
        int index = 0;

        // Collect all negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        // Collect all positive numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13,0, -5, 6,0, -7, 5, -3, -6};
        System.out.println("Original Array: " + Arrays.toString(arr));

        rearrange(arr);

        System.out.println("Rearranged Array: " + Arrays.toString(arr));

}
}
