 package pckgnumber;

public class NumbersWithDigitSeven  {
	 public static void main(String[] args) {
		 int count=0;
	        for (int i = 1; i <= 100; i++) {
	            if (containsDigitSeven(i)) {
	            	count++;
	                System.out.println(i);
	            }
	           
	        }
	        System.out.println(count);
	    }

	    // Method to check if a number contains the digit 7
	    public static boolean containsDigitSeven(int number) {
	        while (number > 0) {
	            if (number % 10 == 7) {
	                return true;
	            }
	            number /= 10;
	        }
	        return false;
	    }
	
}
