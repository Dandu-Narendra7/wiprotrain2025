package com.wipro.oop;

public class restaurant {
	String restaurantName;
	int ratings;
	String items;
	int openOrNot;
	int noOfDeliveries;
	public restaurant() {
		
	}
	public restaurant(String restaurantName, int ratings, String items, int openOrNot, int noOfDeliveries) {
		super();
		this.restaurantName = restaurantName;
		this.ratings = ratings;
		this.items = items;
		this.openOrNot = openOrNot;
		this.noOfDeliveries = noOfDeliveries;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public int getOpenOrNot() {
		return openOrNot;
	}
	public void setOpenOrNot(int openOrNot) {
		this.openOrNot = openOrNot;
	}
	public int getNoOfDeliveries() {
		return noOfDeliveries;
	}
	public void setNoOfDeliveries(int noOfDeliveries) {
		this.noOfDeliveries = noOfDeliveries;
	}
	@Override
	public String toString() {
		return "restaurant [restaurantName=" + restaurantName + ", ratings=" + ratings + ", items=" + items
				+ ", openOrNot=" + openOrNot + ", noOfDeliveries=" + noOfDeliveries;
	}

	
	
}
