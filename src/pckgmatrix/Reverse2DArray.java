package pckgmatrix;

public class Reverse2DArray {

	 public static void main(String[] args) {
	        int[][] a = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Reverse the rows
	        int rows = a.length;
	        int cols=a[0].length;
	        System.out.println(rows);
	        for (int i = 0; i < rows / 2; i++) {
	            int[] temp = a[i];
	            a[i] = a[rows - i - 1];
	            a[rows - i - 1] = temp;
	        }

	        // Print the modified array
	        System.out.println("Reversed Array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
