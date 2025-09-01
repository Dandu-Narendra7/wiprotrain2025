package com.wipro.ordermicroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.ordermicroservice.entity.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrderOrderId(Long orderId);
}

