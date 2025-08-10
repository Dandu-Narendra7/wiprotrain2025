package com.wipro.day5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class employeeex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    class Employee {
	        private String name;
	        private double salary;

	        public Employee(String name, double salary) {
	            this.name = name;
	            this.salary = salary;
	        }

	        public String getName() {
	            return name;
	        }

	        public double getSalary() {
	            return salary;
	        }

	        @Override
	        public String toString() {
	            return "Employee{" +
	                   "name='" + name + '\'' +
	                   ", salary=" + salary +
	                   '}';
	        }
	    }
		 List<Employee> employees = new ArrayList<>();
		    employees.add(new Employee("mahesh", 75000));
		    employees.add(new Employee("rajesh", 50000));
		    employees.add(new Employee("Charan", 90000));
		    employees.add(new Employee("nare", 60000));
		    employees.sort((el,e2) -> e1.getSalary.compareTo(e2.getSalary));

	
	      

}
