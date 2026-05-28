package pckgarr;

public class PerfectArray {
	public static boolean isPerfect(int n, int[] arr) {
        // code here
        
        for(int i=0;i<=n/2;i++)
        {
            if(arr[i]!=arr[n-i-1])
            {
               return true;
            }
        }
        
        return false;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 1};
		int n=arr.length;
		isPerfect(n, arr);
		
		}
}
