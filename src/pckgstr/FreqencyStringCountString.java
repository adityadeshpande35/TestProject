package pckgstr;

import java.util.HashMap;
import java.util.Map;

public class FreqencyStringCountString{

	

	public	static void stringCount(String inputString) {

			// Creating a hashmap object.
			HashMap<String, Integer> hash_map = new HashMap<>();
			String arr[] = inputString.split(" ");

			for (String s : arr) {
				hash_map.put(s, hash_map.getOrDefault(s, 0) + 1);
			}
			System.out.println(hash_map);
			}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "India is my country India is very beautiul";
		stringCount(str);
}
}