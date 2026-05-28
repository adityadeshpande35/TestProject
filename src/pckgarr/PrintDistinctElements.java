package pckgarr;

public class PrintDistinctElements{
	
	public static void printdist(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<i;j++)
			{
				
				if(arr[i] == arr[j])
				{
					flag=true;
					break;
					
				}
			}
			if(flag == false)
			System.out.println(arr[i]+" ");
		}
			
	
	
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int arr[] = new int[]{ 10,8,10,10,7};
		    printdist(arr);
		  
}
	


}