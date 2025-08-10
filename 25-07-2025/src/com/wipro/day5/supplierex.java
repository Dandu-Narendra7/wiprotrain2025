package com.wipro.day5;
import java.time.LocalDate;
import java.time.format.*;
import java.util.function.Supplier;

public class supplierex {
	public static void main(String[] args) {
		Supplier<String> date=()-> LocalDate.now().plusDays(1).getDayOfWeek().toString();
		System.out.println(date.get());
		
	}
	
	

}
