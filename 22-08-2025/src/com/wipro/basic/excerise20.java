package com.wipro.basic;

import java.util.Arrays;

public class excerise20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String st1 = "race";
				String st2 = "care";
//				if(st1.length()!=st2.length()) {
//				System.out.println("giev string is not anagram");	
//				}
				 char[] a1 = st1.toLowerCase().toCharArray();
		         char[] a2 = st2.toLowerCase().toCharArray();
		          Arrays.sort(a1);
		          Arrays.sort(a2);

				if(a1.equals(a2)) {
					System.out.println("given string is anagram");
					
				
				}
				else {
					System.out.println("given string is not anagram");
				}
	}

}
