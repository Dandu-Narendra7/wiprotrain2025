package com.wipro.ordermicroservice.entity;



import jakarta.persistence.*; 
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cart_item_id;
    
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private Cart cart;

    private Long product_id;

    private String product_name;

    private Integer quantity;

    private BigDecimal price;

    private LocalDateTime added_at;

    // getters and setters

    public Long getCartItemId() {
        return cart_item_id;
    }

    public void setCartItemId(Long cart_item_id) {
        this.cart_item_id = cart_item_id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart_id) {
        this.cart = cart_id;
    }

    public Long getProductId() {
        return product_id;
    }

    public void setProductId(Long product_id) {
        this.product_id = product_id;
    }

    public String getProductName() {
        return product_name;
    }

    public void setProductName(String product_name) {
        this.product_name = product_name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getAddedAt() {
        return added_at;
    }

    public void setAddedAt(LocalDateTime added_at) {
        this.added_at = added_at;
    }
}

