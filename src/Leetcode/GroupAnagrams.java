package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	 public static List<List<String>> groupAnagrams(String[] strs) {

	        HashMap<String,List<String>>  hm=new HashMap<>();
	        for(String str:strs)
	        {
	            char[] charArr=str.toCharArray();
	            Arrays.sort(charArr);
	            String sortedstr=String.valueOf(charArr);
	            if(!hm.containsKey(sortedstr))
	            {
	                hm.put(sortedstr,new ArrayList<>());
	            }

	            hm.get(sortedstr).add(str);
	        }
	        return new ArrayList<>(hm.values());
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] inputArr= {"eat","tea","tan","ate","nat","bat"};
         System.out.println(groupAnagrams(inputArr));
	}

}
