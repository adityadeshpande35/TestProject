package pckgarr;

import java.util.HashSet;

public class MergeArrayDuplicate {
	
	public static void mergeDuplicateArray(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
		  int[] c = new int[a.length + b.length];
		
		  for (int i = 0; i < a.length; i ++) { 
	             
	            c[i] = a[i]; 
	        } 
		  for (int i = 0; i < b.length; i++) { 
			  
	            
	            c[a.length + i] = b[i]; 
	        } 
		 /* for (int i = 0; i < c.length; i = i + 1) { 
              
	            // print the element 
	            System.out.print(c[i]+" "); 
		  }*/
	        HashSet<Integer> s=new HashSet<Integer>();
			for( int i=0;i<c.length;i++)
			{
				if(s.contains(c[i])== true)
				{
					System.out.println(c[i]+" ");
				}
				else
				{
					s.add(c[i]);
				}
			}
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,5,6,7};
		int [] b= {1,2,3,4,5,6};
		
		mergeDuplicateArray(a,b);

	}

}
