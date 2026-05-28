package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStrings {
	public static void main(String[] args) {
        // Input list
        List<String> A = new ArrayList<>(Arrays.asList("Apple", "John", "Mike", "Adidas", "Microwave", "Jack"));

        // Group strings based on their starting letters
        Map<Character, List<String>> groupedStrings = A.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        // Print grouped strings
        groupedStrings.forEach((key, value) -> {
            System.out.println("Group Starting with '" + key + "': " + value);
        });
    }
}
