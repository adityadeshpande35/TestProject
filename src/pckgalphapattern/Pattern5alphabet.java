package pckgalphapattern;

public class Pattern5alphabet {
	 public static void main(String[] args) {
	        int n = 5; // Number of rows

	        for (int i = 0; i < n; i++) {
	            char start = (char) ('E' - i); // Determine the starting letter for each row
	            for (char ch = start; ch <= 'E'; ch++) {
	                System.out.print(ch + " ");
	            }
	            System.out.println();
	        }
	    }
}
