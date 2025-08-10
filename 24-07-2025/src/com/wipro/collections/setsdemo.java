package com.wipro.collections;

import java.util.HashSet;
import java.util.Set;

public class setsdemo {
	public static void main(String[] args) {
		 Set<Integer> set1 = new HashSet<>();
	        set1.add(6);
	        set1.add(7);
	        set1.add(9);
	        set1.add(9);
	        set1.add(null);

	        Set<Integer> set2 = new HashSet<>();
	        set2.add(3);
	        set2.add(4);
	        set2.add(5);
	        set1.remove(set2); 

	        System.out.println("Difference is " + set1);
	}
	

}
