package pckgarr;

import java.util.HashMap;

import java.util.HashSet;

public class MergeArrayNonDuplicate {

    public static void mergeNonDuplicateArray(int[] a, int[] b) {
        // Create two HashSets to store elements of a and b
    	
    	int[] c = new int[a.length + b.length];
		
		  for (int i = 0; i < a.length; i ++) { 
	             
	            c[i] = a[i]; 
	        } 
		  for (int i = 0; i < b.length; i++) { 
			  
	            
	            c[a.length + i] = b[i]; 
	        } 
		  
		  HashMap<Integer, Integer> hm = new HashMap<>();
	        
	        for (int i = 0; i < c.length; i++) {
	            hm.put(c[i], hm.getOrDefault(c[i], 0) + 1);
	        }
	        
	        // Print elements that occur only once
	        for (int key : hm.keySet()) {
	            if (hm.get(key) == 1) {
	                System.out.print(key + " ");
	            }
	        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 3, 4, 6, 7};

        mergeNonDuplicateArray(a, b);
    }
}