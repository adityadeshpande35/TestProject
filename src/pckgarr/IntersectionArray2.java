package pckgarr;

public class IntersectionArray2 {

	
	public static void printIntersect(int[] a, int[] b) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<b.length;j++)
			{
				
				if(a[i] == b[j]) 
				{
					flag=true;
					break;
					
				}
			}
			
			if(flag==true)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int []a = {10,15,20,25,30,50};
		    int []b = {30,5,15,80};

		    printIntersect(a,b);
}
}

	