package com.wipro.springdemo.beans;
import org.springframework.stereotype.Component;
@Component
public class Display {
	int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = 15;
	}

	@Override
	public String toString() {
		return "Display [size=" + size + "]";
	}
	
	

}
