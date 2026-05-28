package pckgarr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySort2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
		List<Integer> li=values.stream().sorted().collect(Collectors.toList());
		System.out.println(li);


	}
}
