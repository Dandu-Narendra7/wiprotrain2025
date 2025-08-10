package SreamApi;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Optional <Integer> ops=(Optional<Integer>) Optional.ofNullable(null).orElse("default");
	if(ops.isPresent())
			{
		System.out.println(ops.get());
	}
	

	}

}
