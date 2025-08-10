package com.wipro.day5;

import java.util.function.Function;

public class Functionex {

	public static void main(String[] args) {
		Function<Double,Double> fact= num ->{
			double intergerpart=Math.floor(num);
			return num-intergerpart;
		};
		 double input = 123.45;
	        double fraction = fact.apply(input);
	        System.out.println("Fractional part: " + fraction);
		// TODO Auto-generated method stub
		

	}

}
