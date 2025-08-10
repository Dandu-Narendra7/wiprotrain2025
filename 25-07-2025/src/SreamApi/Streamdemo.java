package SreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Jayantha","Jnanedra");
		List<String> result = names.stream()
                .filter(name -> name.toLowerCase().contains("ja"))
                .collect(Collectors.toList());

        System.out.println(result);

	}

}
