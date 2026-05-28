package pckgarr;

import java.util.HashMap;
import java.util.Map;

public class countFrequencyofElementinArray {
	
	public static void countFreq(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> hm = new HashMap<>();

        // Count the frequency of each element
        for (int element : arr) {
        	hm.put(element, hm.getOrDefault(element, 0) + 1);
        }
        System.out.println("Element : Frequency"+hm);

	
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20};
		    int n = arr.length;
		    countFreq(arr, n);
		}

	
		
	}


