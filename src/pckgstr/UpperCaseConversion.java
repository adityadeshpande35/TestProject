package pckgstr;

public class UpperCaseConversion {
	
	public static String convertToUpperCase(String str) {
		// TODO Auto-generated method stub
		
		String words[]=str.split(" ");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    System.out.println(capitalizeWord.trim());
	   // return capitalizeWord.trim(); 
		
	    String[] capitalizedWords = capitalizeWord.split(" ");

        // Reverse the order of the words
        String reversed = "";
        for (int i = capitalizedWords.length - 1; i >= 0; i--) {
            reversed += capitalizedWords[i] + " ";
        }

        // Return the final result
        System.out.println(reversed.trim());
        return reversed.trim();
    }
		
	
	
	
	public static void main(String[] args) {
	
		String str="i love programming";
		String str1="we play cricket";
	    convertToUpperCase(str);
	    convertToUpperCase(str1);
		
		
	}

	
}
