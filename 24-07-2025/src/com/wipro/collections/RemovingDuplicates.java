package com.wipro.collections;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(2);
        List.add(1);
        List.add(4);
        Set<Integer> duplicate = new HashSet<Integer>();
        duplicate.addAll(List);
        System.out.println(duplicate);

	}

}
