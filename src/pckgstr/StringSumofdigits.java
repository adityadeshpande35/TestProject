package pckgstr;

public class StringSumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "7891";
	        int sum = 0;

	        // Loop through each character in the string
	        for (int i = 0; i < s.length(); i++) {
	            // Convert character to integer by subtracting '0'
	            int digit = s.charAt(i) - '0';
	            sum += digit;
	        }

	        // Print the sum of digits
	        System.out.println("The sum of digits is: " + sum);
	}

}
