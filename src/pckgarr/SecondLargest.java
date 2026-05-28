package pckgarr;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {
	
	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}  
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]={44,66,99,77,33,22,55};  
		int total=b.length;
		System.out.println("Second Largest: "+getSecondLargest(b,total));  
		
	
		//Integer secondhighestno	=Arrays.stream(b).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		//System.out.println(secondhighestno);
	}
	
}
