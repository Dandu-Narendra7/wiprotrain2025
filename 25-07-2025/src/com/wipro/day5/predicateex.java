package com.wipro.day5;
import java.util.function.Predicate;

public class predicateex {
	
	    public static void main(String[] args) {
	    	Predicate <String> isPalindrome = str ->{
	    	String reversed = new  StringBuilder(str).reverse().toString();
	        return str.equalsIgnoreCase(reversed);
	};
	String input="madam";
	System.out.println(input+" palindrom" );
}
}


