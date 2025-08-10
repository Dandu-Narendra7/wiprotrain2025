package com.wipro.order.ms.service;

import java.util.List;

import com.wipro.order.ms.entity.Order;

public interface OrderService {
	void save(Order order);
	List<Order> findAll();
}
