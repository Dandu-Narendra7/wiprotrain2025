package com.wipro.dtoMobile;

public class dtoMobile {
	String Make;
	String modelNumber;
	double price;
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "dtoMobile [Make=" + Make + ", modelNumber=" + modelNumber + ", price=" + price + "]";
	}
	
	
	

}
