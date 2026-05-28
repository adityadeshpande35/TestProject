package Stream;
import java.util.*;

public class MissingEntries {
    public static void main(String[] args) {
        List<String> A = new ArrayList<>(Arrays.asList("One Plus", "Samsung", "Apple", "Vivo", "OPPO"));
        List<String> B = new ArrayList<>(Arrays.asList("One Plus", "Apple","Moto"));

        // Find missing entries
        List<String> missingEntries = findMissingEntries(A, B);

        // Print the result
        System.out.println("Missing Entries: " + missingEntries);
    }

    public static List<String> findMissingEntries(List<String> A, List<String> B) {
        List<String> result = new ArrayList<>();

        // Compare each element of A with B
        for (String item : A) {
            boolean found = false;
            for (String itemB : B) {
                if (item.equals(itemB)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(item);
            }
        }

        return result;
    }
}
