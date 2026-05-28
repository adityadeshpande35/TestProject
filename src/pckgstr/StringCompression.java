package pckgstr;

public class StringCompression {
	 public static String compressString(String input) {
	        StringBuilder compressed = new StringBuilder();
	        int count = 1; // Start with a count of 1 for the first character

	        for (int i = 1; i < input.length(); i++) {
	            if (input.charAt(i) == input.charAt(i - 1)) {
	                count++; // Increment count if the current character is the same as the previous one
	            } else {
	                compressed.append(input.charAt(i - 1)); // Append the character
	                if (count > 1) {
	                    compressed.append(count); // Append the count if it's more than 1
	                }
	                count = 1; // Reset count for the next character
	            }
	        }

	        // Append the last character and its count
	        compressed.append(input.charAt(input.length() - 1));
	        if (count > 1) {
	            compressed.append(count);
	        }

	        return compressed.toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String input = "aaabbbacfwww";
	        String result = compressString(input);
	        System.out.println("Compressed String: " + result);
	}

}
