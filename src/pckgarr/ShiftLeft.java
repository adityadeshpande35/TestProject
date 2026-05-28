package pckgarr;

import java.util.Arrays;

public class ShiftLeft {
	public static void main(String[] args) {
        int[] a = {30, 10, 0, 5, 15, 0, 20, 0, 25, 0, 35};
        
        
        // Shift zeros to the left
        int n = a.length;
        int[] result = new int[n];
        int nonZeroIndex = n - 1;

        // Place non-zero elements in their correct positions
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != 0) {
                result[nonZeroIndex--] = a[i];
            }
        }

        // Fill the remaining positions with zeros (already initialized to zero)
        // Print the result
        System.out.print("Resulting array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        //System.out.println(Arrays.toString(result));
    }
}
