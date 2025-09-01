package com.wipro.ordermicroservice.entity;



import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_id")
    private Long cartId;

    @Column(name="user_id")
    private Long userId;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    @JsonManagedReference
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> cartItems;

    // getters and setters

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cart_id) {
        this.cartId = cart_id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long user_id) {
        this.userId = user_id;
    }

    public LocalDateTime getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getupdated_at() {
        return updated_at;
    }

    public void setUpdatedAt(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}

