package pckgstr;

public class SubsequenceCheck {

    public static boolean isSubsequence(String str1, String str2) {
        int i = 0; // pointer for str1
        int j = 0; // pointer for str2

        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++; // move pointer of str1
            }
            j++; // always move pointer of str2
        }

        return i == str1.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("AXY", "ADXCPY")); // true
        System.out.println(isSubsequence("AXY", "YADXCP")); // false
    }
} 