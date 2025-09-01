package com.wipro.ordermicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ordermicroservice.entity.Order;
import com.wipro.ordermicroservice.entity.OrderItem;
import com.wipro.ordermicroservice.repository.OrderItemRepository;
import com.wipro.ordermicroservice.repository.OrderRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, OrderItemRepository orderItemRepository) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
    }

    public Order createOrder(Order order) {
        order.setOrderDate(LocalDateTime.now());
        order.setCreatedAt(LocalDateTime.now());
        order.setUpdatedAt(LocalDateTime.now());
        order.setOrderStatus("CREATED");
        Order savedOrder = orderRepository.save(order);

        if (order.getOrderItems() != null) {
            for (OrderItem item : order.getOrderItems()) {
                item.setOrder(savedOrder);
                orderItemRepository.save(item);
            }
        }
        return savedOrder;
    }

    public Optional<Order> getOrderById(Long orderId) {
        return orderRepository.findById(orderId);
    }

    public List<Order> getOrdersByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> cancelOrder(Long orderId) {
        Optional<Order> orderOptional = orderRepository.findById(orderId);
        orderOptional.ifPresent(order -> {
            order.setOrderStatus("CANCELLED");
            order.setUpdatedAt(LocalDateTime.now());
            orderRepository.save(order);
        });
        return orderOptional;
    }
}

