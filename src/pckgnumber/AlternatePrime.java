package pckgnumber;

public class AlternatePrime {
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Alternate Prime Numbers between 1 to 100:");
	        int count = 0;
	        for (int i = 1; i <= 100; i++) {
	            if (isPrime(i)) {
	                count++;
	                if (count % 2 != 0) {
	                    System.out.print(i + " ");
	                }
	            }
	        }
	}
}
