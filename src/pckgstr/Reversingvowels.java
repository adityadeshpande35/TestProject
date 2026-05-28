package pckgstr;
import java.util.*;
public class Reversingvowels {
	  public static String reverseVowels(String str) {
	        char[] strArray = str.toCharArray();
	        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 
	                                                             'A', 'E', 'I', 'O', 'U'));
	        int left = 0, right = strArray.length - 1;

	        while (left < right) {
	            // Move left pointer until it finds a vowel
	            while (left < right && !vowels.contains(strArray[left])) {
	                left++;
	            }
	            // Move right pointer until it finds a vowel
	            while (left < right && !vowels.contains(strArray[right])) {
	                right--;
	            }
	            // Swap vowels
	            char temp = strArray[left];
	            strArray[left] = strArray[right];
	            strArray[right] = temp;

	            left++;
	            right--;
	        }

	        return new String(strArray);
	    }

	    public static void main(String[] args) {
	        String str = "cricket";
	        System.out.println("Original: " + str);
	        System.out.println("Reversed Vowels: " + reverseVowels(str));
	    }

}
