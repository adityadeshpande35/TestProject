package pckgnopattern;

public class patternnumber8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
        int num = 1;

        // Upper part of the pattern
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = N; i >= 1; i--) {
            num -= i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
                if (j < i) {
                    System.out.print("*");
                }
            }
            num -= i; // Reset the starting point for the next row
            System.out.println();
        }
	}

}
