package com.wipro.collections;

import java.util.HashMap;
import java.util.Map;

public class mapdemo {
	public static void main(String[] args) {
		Map<String,String>Cureency=new HashMap<>();
		Cureency.put("USD", "United states");
		Cureency.put("Rupee", "India");
		Cureency.put("Dollor", "England");
		System.out.println(Cureency.get("key"));
		
	}

}
