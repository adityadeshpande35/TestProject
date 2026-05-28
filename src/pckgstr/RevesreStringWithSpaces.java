package pckgstr;

public class RevesreStringWithSpaces {
	 public static String reversePreservingSpaces(String str) {
	        // Convert input string to a character array
		 char[] chars = str.toCharArray();
	        int left = 0, right = chars.length - 1;

	        while (left < right) {
	            // Move left index forward if it's a space
	            if (chars[left] == ' ') {
	                left++;
	                continue;
	            }
	            // Move right index backward if it's a space
	            if (chars[right] == ' ') {
	                right--;
	                continue;
	            }

	            // Swap characters
	            char temp = chars[left];
	            chars[left] = chars[right];
	            chars[right] = temp;

	            // Move pointers
	            left++;
	            right--;
	        }

	        return new String(chars);
	    }

	    public static void main(String[] args) {
	        String input = "I Am Not String";
	        System.out.println("Original String: " + input);

	        String result = reversePreservingSpaces(input);

	        System.out.println("Reversed String Preserving Spaces: " + result);
	    }
}
