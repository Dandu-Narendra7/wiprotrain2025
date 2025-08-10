package com.wipro.car.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarRegistrationDetail {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    Long id;

	    String registrationNumber;

	    LocalDate dateOfRegistration;

	   
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getRegistrationNumber() { return registrationNumber; }
	    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }

	    public LocalDate getDateOfRegistration() { return dateOfRegistration; }
	    public void setDateOfRegistration(LocalDate dateOfRegistration) { this.dateOfRegistration = dateOfRegistration; }
	
}
