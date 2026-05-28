package pckgmatrix;

public class ZigZagTraversal {
	public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        boolean flag = true;
        for(int i=0 ;i<arr.length; i++){
            if(flag){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j=arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
            flag = !flag;
        }
    }
}
