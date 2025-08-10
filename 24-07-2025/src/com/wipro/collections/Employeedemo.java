package com.wipro.collections;
import java.util.Comparator;

public  class Employeedemo implements Comparable<Employeedemo>  {

	
		// TODO Auto-generated method stub
		String empId;
		String empName;
		int empAge;
		double empSalary;
		
		
		

	public String getEmpId() {
			return empId;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public int getEmpAge() {
			return empAge;
		}

		public void setEmpAge(int empAge) {
			this.empAge = empAge;
		}

		public double getEmpSalary() {
			return empSalary;
		}

		public void setEmpSalary(double empSalary) {
			this.empSalary = empSalary;
		}
		public Employeedemo(String empId,String empName,int empAge,double empSalary) {
			super();
			this.empId=empId;
			this.empAge =empAge ;
			this.empName =empName ;
			this.empSalary = empSalary;
		}
		
		

	@Override
		public String toString() {
			return "Employeedemo [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary="
					+ empSalary + "]";
		}
	public double compareT0(Employeedemo other) {
		Double d1= Double.valueOf(this.getEmpAge());
		Double d2=  Double.valueOf(other.getEmpAge());
		return d1.compareTo(d2);
		
	}

	@Override
	public int compareTo(Employeedemo o) {
		// TODO Auto-generated method stub
		return 0;
	}
}



	

