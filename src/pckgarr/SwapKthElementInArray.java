package pckgarr;

public class SwapKthElementInArray {
	public static void swapKth(int n, int k, int[] arr) {
        // code here
        
        int fromBeginning = k - 1;  // Index is 0-based
        int fromEnd = n - k;  // Index is 0-based
        
        // Swap the elements
        int temp = arr[fromBeginning];
        arr[fromBeginning] = arr[fromEnd];
        arr[fromEnd] = temp;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int n=arr.length;
		int k=3;
		System.out.println("Before swapping");
		for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
		swapKth(n,k,arr);
		System.out.println("After swapping");
		for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
	}
}
