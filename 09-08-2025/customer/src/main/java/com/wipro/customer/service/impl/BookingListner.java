package com.wipro.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.wipro.customer.entity.Booking;
import com.wipro.customer.repo.*;
import com.wipro.customer.util.AppConstant;

@Service
public class BookingListner {
	
	@Autowired
	BookingRepo bookingrepo;
	@KafkaListener(topics=AppConstant.INCOMING_TOPIC_NAME,groupId="UBER_BOOKING")
	void processBankMessage(Booking  booking)
	{
		System.out.println("--Message Received by GPay="+booking);
		Booking bookingDb=bookingrepo.findById(booking.getId()).get();
		bookingDb.setStatus(booking.isStatus());
		bookingrepo.save(bookingDb);
		
		}
}
