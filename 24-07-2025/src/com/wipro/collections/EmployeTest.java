package com.wipro.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeedemo emp1=new Employeedemo("123M","Mahesh",21,2000);
		Employeedemo emp2=new Employeedemo("123R","Rajesh",25,2800);
		Employeedemo emp3=new Employeedemo("123N","Narendra",24,2600);
		Employeedemo emp4=new Employeedemo("123P","Pavan",26,3000);
		
		List<Employeedemo> empData=new ArrayList<>();
		empData.add(emp1);
		empData.add(emp2);
		empData.add(emp3);
		empData.add(emp4);
		Collections.sort(empData);
		System.out.println(empData);
		Collections.sort(empData,new SortByempAge());
		System.out.println(empData);
		Collections.sort(empData,new SortByMovieName());
		System.out.println(empData);
		Collections.sort(empData,new SortByImdbRating());
		System.out.println(empData);
		
		

	}

}
