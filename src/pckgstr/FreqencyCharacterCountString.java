package pckgstr;

import java.util.HashMap;
import java.util.Map;

public class FreqencyCharacterCountString {

	

	public	static void characterCount(String inputString) {

			// Creating a hashmap object.
			HashMap<Character, Integer> hash_map = new HashMap<>();
			char[] strArray = inputString.toCharArray();

			for (char c : strArray) {
				hash_map.put(c, hash_map.getOrDefault(c, 0) + 1);
			}
			System.out.println(hash_map);
			}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="grass is greener on the other side";
		characterCount(str);
}
}