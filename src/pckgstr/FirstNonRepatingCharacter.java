package pckgstr;

import java.util.HashMap;

public class FirstNonRepatingCharacter {
	public static int findFirstNonRepeatingIndex(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] strArray = s.toCharArray();
        // Count the frequency of each character in the string
        for (char c : strArray) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        // Find the index of the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i; // Return the index of the first non-repeating character
            }
        }

        return -1; // Return -1 if no non-repeating character is found
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "swiss";
        int index = findFirstNonRepeatingIndex(input);

        if (index != -1) {
            System.out.println("First non-repeating character: " + input.charAt(index));
            System.out.println("Index: " + index);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

	

}
