package pckgstr;

public class Reverseeachwordinstring {
	
	public static void main(String[] args) {
        String str = "We are playing cricket";

        String arr[] = str.split(" ");
        String reversedString = ""; // Declare the result string outside the loop

        for (String word : arr) {
            String reverse = ""; // Reverse variable to store each reversed word
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }
            reversedString = reversedString + reverse + " "; // Append reversed word with a space
        }

        System.out.println("Reversed string is: " + reversedString.trim()); // Trim trailing space
    }

}
