package com.wipro.collections;

import java.util.ArrayList;
import java.util.List;

public class demoremove {
	public static void main(String[] args) {
		
	
	Employeedemo emp1=new Employeedemo("123M","Mahesh",21,2000);
	Employeedemo emp2=new Employeedemo("123R","Rajesh",25,2800);
	Employeedemo emp3=new Employeedemo("123N","Narendra",24,2600);
	Employeedemo emp4=new Employeedemo("123P","Pavan",26,3000);
	
	List<Employeedemo> empData=new ArrayList<>();
	empData.add(emp1);
	empData.add(emp2);
	empData.add(emp3);
	empData.add(emp4);
	
	for(Employeedemo demoremove:empData ) {
		if(Employeedemo.getEmpSalary()>80000)(Employeedemo.remove(Employeedemo));
		{
		system.out.println("after rmoving”);
		System.out.println(Employeedemo.toString())；
		}
          
	}
	}
}
