package pckgarr;

import java.util.HashSet;

public class PrintDistinctElements2{
	
	public static void printdist(int[] arr) {
		// TODO Auto-generated method stub
		HashSet<Integer> s=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(s.contains(arr[i])== false)
			{
				System.out.print(arr[i]+" ");
				s.add(arr[i]);
			}
		
		}
			
	
	
	}
	
	
	
	

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int arr[] = new int[]{ 10,8,10,10,7};
		    printdist(arr);
		    
		  
}


}