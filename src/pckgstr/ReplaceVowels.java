package pckgstr;

public class ReplaceVowels {
	public static void main(String[] args) {
        String input = "Tomorrow";
        System.out.println("Output: " + replaceVowels(input));
    }

    public static String replaceVowels(String str) {
        String vowels = "AEIOUaeiou"; // Define vowels
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) { // Check if the character is a vowel
                result.append("&");
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
