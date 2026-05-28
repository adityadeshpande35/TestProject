package pckgstr;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCount2 {
	
	
	static void duplicateChars(String inputString) {

		// Creating a hashmap object.
		HashMap<Character, Integer> hash_map = new HashMap<>();
		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			hash_map.put(c, hash_map.getOrDefault(c, 0) + 1);
		}

		
		Set<Character> keys = hash_map.keySet();
		for (char c : keys) {
		if (hash_map.get(c) >1) {
		System.out.println(c + "-->" + hash_map.get(c));
			//System.out.println(c);
}
		}
	}

public static void main(String[] args) {
duplicateChars("rahulshettyacademy");

}
}
