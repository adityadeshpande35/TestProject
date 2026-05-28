package pckgstr;

import java.util.HashMap;




import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MinMaxoccuringcharacterinString {
	public static void minmaxoccuringcharacter(String str) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hash_map = new HashMap<>();
		char[] strArray = str.toCharArray();

		for (char c : strArray) {
			hash_map.put(c, hash_map.getOrDefault(c, 0) + 1);
		}
		int maxCount=0;
		char maxchar=' ';   
		char minchar=' ';
		int mincount=Integer.MAX_VALUE;
		for(Map.Entry<Character,Integer> me:hash_map.entrySet())
		{
			if(maxCount<me.getValue())
			{
				maxCount=me.getValue();
				maxchar=me.getKey();
			}
			if(mincount>me.getValue())
			{
				mincount=me.getValue();
				minchar=me.getKey();
			}
		}
		System.out.println("Maximum reapeating character is:"+maxchar);
		System.out.println("minimum reapeating character is:"+minchar);

 
	}
	

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aaaabbbccd";
		minmaxoccuringcharacter(str);
}
	}

	
