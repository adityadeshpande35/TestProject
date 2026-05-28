package Stream;

import java.util.Arrays;

public class StreamDemo1 {
	public static void main(String[] args) {
		
		String [] arr= {"abc","cde","acd","aec","xyz"};
		Arrays.stream(arr).filter(z->z.startsWith("a"))
		.filter(z->z.endsWith("c")).sorted().forEach(System.out::println);
	}
}
