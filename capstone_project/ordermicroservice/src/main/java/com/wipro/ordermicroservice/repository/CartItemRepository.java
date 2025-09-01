package com.wipro.ordermicroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.ordermicroservice.entity.CartItem;



public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByCartCartId(Long cartId);
}
