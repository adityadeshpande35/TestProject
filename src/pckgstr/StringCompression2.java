package pckgstr;

import java.util.HashMap;
import java.util.Map;

public class StringCompression2 {
public static String compressString(String str) {
    // Convert input string to lowercase for case-insensitive comparison
    String lowerCaseInput = str.toLowerCase();

    // Split the input string into words
    String[] words = lowerCaseInput.split(" "); // Split by whitespace

    // Use LinkedHashMap to maintain the order of words
    Map<String, Integer> hm = new HashMap<>();

    // Count the occurrences of each word
    for (String word : words) {
        hm.put(word, hm.getOrDefault(word, 0) + 1);
    }

    // Build the compressed string
    StringBuilder compressed = new StringBuilder();
    for (String word : words) {
        if (hm.containsKey(word)) {
            compressed.append(word).append(hm.get(word)).append(" ");
            hm.remove(word); // Avoid duplicate entries for the same word
        }
    }

    // Trim the trailing space and return the result
    return compressed.toString().trim();
}


public static void main(String[] args)
{


    String input = "India is my country and India is rich country";
    String result = compressString(input);
    System.out.println("Compressed String: " + result); // Output: india2 is2 my1 country2 and1 rich1
}
}
