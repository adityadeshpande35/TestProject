package pckgstr;

public class RemoveAllDigits {
	 public static String removeAllDigit(String str)
	    {
	        // Converting the given string
	        // into a character array
	        char[] strArray = str.toCharArray();
	        String result = "";
	  
	        // Traverse the character array
	        for (int i = 0; i < strArray.length; i++) {
	  
	            // Check if the specified character is not digit
	            // then add this character into result variable
	            if (!Character.isDigit(strArray[i])) {
	                result = result + strArray[i];
	            }
	        }
	  
	        // Return result
	        return result;
	    }
	  
	    // Driver Code
	    public static void main(String args[])
	    {
	    	 String str = "Geeks For Geeks 123 Hello 34";
	    	  
	         // Print the modified string
	         System.out.println(removeAllDigit(str+" "));
	  


	}

}
