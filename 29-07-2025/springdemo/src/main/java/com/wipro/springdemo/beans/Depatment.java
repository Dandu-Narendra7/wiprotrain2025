package com.wipro.springdemo.beans;

public class Depatment {
	String deptCode;
	String departmentName;
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Springdept [deptCode=" + deptCode + ", departmentName=" + departmentName + "]";
	}
	

}
