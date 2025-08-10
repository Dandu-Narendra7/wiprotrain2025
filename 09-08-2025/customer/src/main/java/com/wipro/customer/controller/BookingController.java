package com.wipro.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.customer.entity.Booking;
import com.wipro.customer.service.BookingService;

@RestController
@RequestMapping("/Booking")
public class BookingController {
	@Autowired
	BookingService bookingService;
	@PostMapping
	void pay(@RequestBody Booking booking) {
		
	}

}
