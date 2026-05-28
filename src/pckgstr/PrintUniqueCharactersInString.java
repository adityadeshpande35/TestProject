package pckgstr;

import java.util.HashMap;
import java.util.Map;

public class PrintUniqueCharactersInString {
	
	public static void uniqueChars(String inputString) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hash_map = new HashMap<>();
		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			hash_map.put(c, hash_map.getOrDefault(c, 0) + 1);
		}

		
	
	
	System.out.println("Unique characters in the string are:");
    for (Map.Entry<Character, Integer> entry : hash_map.entrySet()) {
        if (entry.getValue() == 1) {
            System.out.print(entry.getKey() + " ");
        }
    }
	}
public static void main(String[] args) {
	uniqueChars("rahulshettyacademy");

	}


}
