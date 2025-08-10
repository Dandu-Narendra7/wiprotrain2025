package SreamApi;

import java.util.Arrays;
import java.util.List;

public class Streamex2 {
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(23,30,10,30);
		int sum = num.stream()
		.reduce(0, (a, b)->a+b);
		int count = num.size();
		System.out.println(sum/count);
			
}
}
