package wiprocom;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Narendra","mahesh","rajesh");
		 List<String> sortedNames = names.stream()
                 .sorted(String::compareToIgnoreCase)
                 .collect(Collectors.toList());
		 sortedNames.forEach(System.out::println);

		
	}

}
