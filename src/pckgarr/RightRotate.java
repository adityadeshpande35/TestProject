package pckgarr;

public class RightRotate {
	public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        //n determine the number of times an array should be rotated  
        int n = 3; 
        for(int i = 0; i < n; i++){  
            int j, last;  
            last = arr[arr.length-1]; 
            for(j = arr.length-1; j >0; j--){  
                //Shift element of array by one  
                arr[j] = arr[j-1];  
            }  
            arr[j] = last;  
        }  
        System.out.println();  
        System.out.println("Array after right rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
        }
	
	}
	

