package pckgnopattern;

public class patternnumber9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5; // Input value

        // Upper part of the pattern
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
	}

}
