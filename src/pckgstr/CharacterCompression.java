package pckgstr;

import java.util.HashMap;

public class CharacterCompression {
    public static String compressString(String str) {
    	HashMap<Character, Integer> hm = new HashMap<>();
		char[] strArray = str.toCharArray();

		for (char c : strArray) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		
		
		StringBuilder compressed = new StringBuilder();
	    for (char  c : strArray) {
	        if (hm.containsKey(c)) {
	            compressed.append(c).append(hm.get(c));
	            hm.remove(c); // Avoid duplicate entries for the same word
	        }
	    }

		
        

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "ababcawfana";
        String result = compressString(input);
        System.out.println("Compressed String: " + result); // Output should be a4b3cfw3
    }
}

