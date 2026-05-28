package Leetcode;
import java.util.*;

public class LongestSubString {

	public static int LengthOfLongestSubString(String str)
	{
		int start=0;
		int maxlength=0;
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int end=0;end<str.length();end++)
		{
			char curr=str.charAt(end);
			if(hm.containsKey(curr))
			{
				start=Math.max(start, hm.get(curr)+1);
			}
			hm.put(curr,end);
			maxlength=Math.max(maxlength,end-start+1);
		
	}
		return  maxlength;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input="pwwkew";
		int ml=LengthOfLongestSubString(input);
		System.out.println(ml);
	}

}
