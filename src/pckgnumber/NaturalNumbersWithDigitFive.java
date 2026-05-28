package pckgnumber;

public class NaturalNumbersWithDigitFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int count = 0; // To count numbers with digit 5
	        int number = 1; // Start from the first natural number

	        System.out.println("First 10 natural numbers containing digit 5:");
	        
	        while (count < 10) {
	            if (containsDigitFive(number)) {
	                System.out.print(number + " ");
	                count++;
	            }
	            number++;
	        }
	    }

	    // Method to check if a number contains the digit 5
	    private static boolean containsDigitFive(int num) {
	        while (num > 0) {
	            if (num % 10 == 5) {
	                return true;
	            }
	            num = num/10; // Remove the last digit
	        }
	        return false;
	}

}
