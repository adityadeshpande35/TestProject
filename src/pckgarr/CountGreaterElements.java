package pckgarr;

public class CountGreaterElements {
	
	public static void printGreater(int[] arr) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<arr.length;i++)
		{
			int count =0;
		
			for(int j=0;j<arr.length;j++)
			
		 
			if(i!=j && arr[j]>arr[i])
			
				count++;
				System.out.print(count +" ");
			
				
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int arr[] = new int[]{ 8,10,2,20};
		    
		    printGreater(arr);
}
}