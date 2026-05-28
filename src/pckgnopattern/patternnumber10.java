package pckgnopattern;

public class patternnumber10 {

	public static void main(String[] args) {
        int n = 5; // Change this value for more rows

        for (int i = 1; i <= n; i++) {
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print spaces (2*(n-i) spaces)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Print decreasing numbers (without skipping)
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

}
