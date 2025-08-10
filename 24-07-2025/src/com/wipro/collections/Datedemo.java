package com.wipro.collections;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datedemo {
	public static void main(String[] args) {
		LocalDate dt=LocalDate.now();
		DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String dtfor=dt.format(dateFormatter);
		System.out.println(dtfor);
		
		
	}
	

}
