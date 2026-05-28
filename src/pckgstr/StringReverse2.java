package pckgstr;

public class StringReverse2 {
	public static void main(String[] args) {

		String inputString = "Rahul Shetty Academy";
		String outputString = "";

	

		for (int i = inputString.length() - 1; i >= 0; i--) {
		outputString = outputString + inputString.charAt(i);
		}

		System.out.println(outputString);
		}

		}

