package ApanaCollegePattern2;

public class InvetedTriangleWithAlpha {
	public static void main(String[] args) {

        int rows = 5;
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int space = 1; space < i; space++) {
                System.out.print("  "); // 4 spaces for indentation
            }

            // Print alphabets
            for (int j = rows; j >= i; j--) {
                System.out.print(ch + " "); // spacing between letters
            }

            System.out.println();
            ch++; // move to next alphabet
        }
    }
}
