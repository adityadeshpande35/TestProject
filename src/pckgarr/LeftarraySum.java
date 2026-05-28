package pckgarr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftarraySum {
	
	public static int splitIntoTwo(List<Integer> arr) {
        int res = 0;
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
	//sum =13
        int leftSum = 0;
        for(int i=0; i<arr.size()-1; i++){
            leftSum += arr.get(i);
            sum -= arr.get(i);
            System.out.println(leftSum +" "+sum );
           /*10 , 3  || 14 , -1 ||6,7*/  
	   if(leftSum > sum){
                res++;
            } /*1 ,2 */
        }
        return res;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[] = new int[]{10,4,-8,7};
	    List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        int result = splitIntoTwo(list); // Call splitIntoTwo method
        System.out.println("Result: " + result); 

	    
	    
}
}