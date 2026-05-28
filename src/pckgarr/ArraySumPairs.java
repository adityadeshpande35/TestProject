package pckgarr;

import java.util.HashMap;
import java.util.Map;

public class ArraySumPairs {
	public static void main(String[] args) {
        int[] input = {-4, 2, 1, 0,-1, -3, 0, 2, -2, 0};
        int targetSum = -2;

        // Find and print all pairs
        findPairsWithSum(input, targetSum);
    }

    public static void findPairsWithSum(int[] arr, int targetSum) {
        // HashMap to store the frequency of elements
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array to find pairs
        int count=0;
        for (int num : arr) {
            // Calculate the complement needed for the target sum
            int complement = targetSum - num;

            // If the complement exists in the map, a pair is found
            
            if (map.getOrDefault(complement, 0) > 0) {
                System.out.println("Pair: (" + complement + ", " + num + ")");
                // Decrement the count of the complement in the map
                map.put(complement, map.get(complement) - 1);
                count++;
                
                
            } else {
                // Add the current number to the map
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            
           
        }
        System.out.println("count is:"+count);
    }
}
