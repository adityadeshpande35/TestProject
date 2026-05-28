package pckgstr;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsString2 {
	static void duplicateStrings(String inputString) {

		// Creating a hashmap object.
		String arr[]=inputString.split(" ");

		HashMap<String, Integer> hash_map = new HashMap<>();
		

		for (String s : arr) {
			hash_map.put(s, hash_map.getOrDefault(s, 0) + 1);
		}

		
		Set<String> keys = hash_map.keySet();
		for (String c : keys) {
		if (hash_map.get(c) > 1) {
		System.out.println(c + "-->" + hash_map.get(c));
}
		}
	}

public static void main(String[] args) {
duplicateStrings("Big black bug bit a big black dog on his big black nose");
}
}
