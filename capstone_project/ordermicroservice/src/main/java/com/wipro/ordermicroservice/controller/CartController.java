package com.wipro.ordermicroservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.ordermicroservice.entity.Cart;
import com.wipro.ordermicroservice.entity.CartItem;
import com.wipro.ordermicroservice.service.CartService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
    private final CartService cartService;

   
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add")
    public ResponseEntity<Cart> addCart(@RequestBody Cart cart) {
        Cart savedCart = cartService.addNewCart(cart);
        return ResponseEntity.ok(savedCart);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Cart> getCartByUserId(@PathVariable Long userId) {
        Optional<Cart> cartOpt = cartService.getCartByUserId(userId);
        return cartOpt.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/items/{cartId}")
    public ResponseEntity<List<CartItem>> getCartItems(@PathVariable Long cartId) {
        List<CartItem> cartItems = cartService.getCartItemsByCartId(cartId);
        return ResponseEntity.ok(cartItems);
    }

    @DeleteMapping("/item/{cartItemId}")
    public ResponseEntity<Void> deleteCartItem(@PathVariable Long cartItemId) {
        cartService.deleteCartItem(cartItemId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/item/update/{cartItemId}")
    public ResponseEntity<CartItem> updateCartItemQuantity(@PathVariable Long cartItemId, @RequestParam Integer quantity) {
        CartItem updatedItem = cartService.updateCartItemQuantity(cartItemId, quantity);
        if (updatedItem != null) {
            return ResponseEntity.ok(updatedItem);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
