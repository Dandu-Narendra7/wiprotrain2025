package com.wipro.order.ms.service.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.order.ms.entity.Order;
import com.wipro.order.ms.repo.OrderRepo;
import com.wipro.order.ms.service.OrderService;
import com.wipro.order.ms.service.PaymentConnectService;
import com.wipro.payment.entity.Payment;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepo orderRepo;

	@Autowired
	RestTemplate restTemplate;
	@Autowired
	PaymentConnectService paymentConnectService;

	@Override
	@CircuitBreaker(name = "order-cb", fallbackMethod = "handleFallBack")
	public void save(Order order) {
		order.setOrderStatus("I");
		orderRepo.save(order);
		String url = "http://payment-ms/payment";
		Payment payment = new Payment();
		payment.setOrderId(order.getId());
		payment.setPaymentAmount(order.getOrderValue());
		payment.setPaymentStatus(true);
		ResponseEntity<Payment> response = PaymentConnectService.savePaymentData(payment);

		if (response.getStatusCode() == HttpStatusCode.valueOf(200)) {
			order.setOrderStatus("P");

		}
		orderRepo.save(order);// update
	}

	@Override
	public List<Order> findAll() {

		return orderRepo.findAll();
	}

	String handleFallBack(Throwable t) {

		System.out.println("--System is down--");
		return "System is down";
	}
}
