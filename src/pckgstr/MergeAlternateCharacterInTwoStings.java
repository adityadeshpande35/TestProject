package pckgstr;

public class MergeAlternateCharacterInTwoStings {
	public static String merge(String S1, String S2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        // Iterate through both strings
        while (i < S1.length() && j < S2.length()) {
            result.append(S1.charAt(i));
            result.append(S2.charAt(j));
            i++;
            j++;
        }

        // Add remaining characters of S1 if any
        while (i < S1.length()) {
            result.append(S1.charAt(i));
            i++;
        }

        // Add remaining characters of S2 if any
        while (j < S2.length()) {
            result.append(S2.charAt(j));
            j++;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(MergeAlternateCharacterInTwoStings.merge("Hello", "Bye"));  // Output: HBeylelo
        System.out.println(MergeAlternateCharacterInTwoStings.merge("abc", "def"));    // Output: adbecf
    }
}
