package pckgarr;

import java.util.HashMap;

public class Anagramarray {
	
	public static boolean  checkAnagram(int []arr1,int []arr2)
	{
		if (arr1.length != arr2.length) {
            return false;
        }
        
        // Create a HashMap to store the frequency of elements in arr1
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        // Count the frequency of each element in arr1
        for (int num : arr1) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        // Iterate through arr2 and decrease the count in the frequency map
        for (int num : arr2) {
            if (!hm.containsKey(num) || hm.get(num) == 0) {
                return false;
            }
            hm.put(num, hm.get(num) - 1);
        }
        
        // If all counts are zero, the arrays are equal
        return true;
		
		
	}
	
	public static void main(String[] args) {
		
		int []arr1= {1,2,5,4,0};
		int []arr2= {2,4,5,0,1};
		
		boolean status=checkAnagram(arr1,arr2);
		
		System.out.println("is given arrays are anagram:"+status);		
		
	}

}
