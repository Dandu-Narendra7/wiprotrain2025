package com.wipro.springdemo.beans;

public class College {
	String collegeName;
	Depatment department;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Depatment getDepartment() {
		return department;
	}
	public void setDepartment(Depatment department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", department=" + department + "]";
	}
	

}
