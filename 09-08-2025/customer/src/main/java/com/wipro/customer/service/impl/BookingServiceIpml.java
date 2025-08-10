package com.wipro.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.customer.entity.Booking;
import com.wipro.customer.repo.BookingRepo;
import com.wipro.customer.service.BookingService;
import com.wipro.customer.util.*;
@Service
public class BookingServiceIpml implements BookingService{
	@Autowired
	BookingRepo bookinrepo;
	@Autowired
	KafkaTemplate kafkaTemplate;
	@Override
	public void check(Booking booking) {
		kafkaTemplate.send(AppConstant.OUTGOING_TOPIC_NAME, booking);
	}
		 
	
	
	@Override
	public void pay(Booking booking) {
		// TODO Auto-generated method stub
		
	}
	

}
