package pckgarr;

import java.util.HashSet;

public class IntersectionArray1 {

	
	public static void printIntersect(int[] a, int[] b) {
		// TODO Auto-generated method stub
		HashSet<Integer> s=new HashSet<Integer>();
		for(int i=0;i<b.length;i++)
		s.add(b[i]);
		for(int i=0;i<a.length;i++)
			if(s.contains(a[i]))
				System.out.print(a[i]+" ");
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int []a = {10,15,20,25,30,50};
		    int []b = {30,5,15,80};

		    printIntersect(a,b);
}
}

	