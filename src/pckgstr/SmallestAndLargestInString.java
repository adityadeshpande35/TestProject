package pckgstr;

public class SmallestAndLargestInString {
	
	public static void SmallestAndLargetInString(String str) {
		// TODO Auto-generated method stub
		
	
    String[] words = str.split(" ");
    
    String smallestWord = words[0];
    String largestWord = words[0];
    
    for (int i = 1; i < words.length; i++) {
        if (words[i].length() < smallestWord.length()) {
            smallestWord = words[i];
        }
        if (words[i].length() > largestWord.length()) {
            largestWord = words[i];
        }
    }
    
    System.out.println("Smallest word: " + smallestWord);
    System.out.println("Largest word: " + largestWord);
    
    
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	String str="Hardships often prepare ordinary people for an extraordinary destiny";
	SmallestAndLargetInString(str);
}
}

