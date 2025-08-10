package com.wipro.payment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.payment.entity.Payment;
import com.wipro.payment.repo.PaymentRepo;

@Service
public class PaymentServiceImpl {
	@Autowired
	PaymentRepo paymentRepo;
	
	
	public void save(Payment payment) {
		 
		paymentRepo.save(payment);
	}


	public List<Payment> findAll() {
		 
		return paymentRepo.findAll();
	}


}
