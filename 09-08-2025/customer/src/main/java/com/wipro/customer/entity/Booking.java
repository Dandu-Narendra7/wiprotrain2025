package com.wipro.customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="booking")
@Data
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rider_Name")
	String riderName;
	@Column(name="pickup_Location")
	String pickupLocation;
	@Column(name="drop_Location")
	String dropLocation;
	@Column(name="Price")
	double Price;
	@Column(name="status")
	boolean status;
	
	
	

}
