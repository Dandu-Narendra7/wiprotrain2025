package com.wipro.thymeleafdemo1.controller;

public class Crickter {
	 String name;
     public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	String type;
	@Override
	public String toString() {
		return "Crickter [name=" + name + ", type=" + type + "]";
	}
	


}
