package pckgstr;

public class DuplicateWordsString {
	    
     public static void getDuplicateCount(String string1) {
 		// TODO Auto-generated method stub
 		
  
     //Converts the string into lowercase    
     string1 = string1.toLowerCase();    
         
     //Split the string into words using built-in function    
     String words[] = string1.split(" ");    
         
     System.out.println("Duplicate words in a given string : ");     
     for(int i = 0; i < words.length; i++) {    
         int count = 1;    
         for(int j = i+1; j < words.length; j++) {    
             if(words[i].equals(words[j])) {    
                 count++;    
                 //Set words[j] to 0 to avoid printing visited word    
                 words[j] = "0";    
             }    
         }    
             
         //Displays the duplicate word if count is greater than 1    
         if(count > 1 && words[i] != "0")    
             System.out.println(words[i]);    
     }    
     }
     public static void main(String[] args) {
    	 String string = "Big black bug bit a big black dog on his big black nose";    
         getDuplicateCount(string);
}
}

	
