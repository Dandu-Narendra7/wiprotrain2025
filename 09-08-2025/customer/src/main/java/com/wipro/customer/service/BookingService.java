package com.wipro.customer.service;

import com.wipro.customer.entity.Booking;

public interface BookingService {
	  void pay(Booking booking);

	void check(Booking booking);	 
}
