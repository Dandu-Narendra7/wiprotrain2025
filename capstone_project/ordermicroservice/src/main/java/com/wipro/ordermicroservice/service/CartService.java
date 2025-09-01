package com.wipro.ordermicroservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ordermicroservice.entity.Cart;
import com.wipro.ordermicroservice.entity.CartItem;
import com.wipro.ordermicroservice.repository.CartItemRepository;
import com.wipro.ordermicroservice.repository.CartRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;

    @Autowired
    public CartService(CartRepository cartRepository, CartItemRepository cartItemRepository) {
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
    }

    public Cart addNewCart(Cart cart) {
        cart.setCreatedAt(LocalDateTime.now());
        cart.setUpdatedAt(LocalDateTime.now());
        Cart savedCart = cartRepository.save(cart);

        if (cart.getCartItems() != null) {
            for (CartItem item : cart.getCartItems()) {
                item.setCart(savedCart);
                item.setAddedAt(LocalDateTime.now());
                cartItemRepository.save(item);
            }
        }
        return savedCart;
    }

    public Optional<Cart> getCartByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    public List<CartItem> getCartItemsByCartId(Long cartId) {
        return cartItemRepository.findByCartCartId(cartId);
    }

    public void deleteCartItem(Long cartItemId) {
        cartItemRepository.deleteById(cartItemId);
    }

    public CartItem updateCartItemQuantity(Long cartItemId, Integer quantity) {
        Optional<CartItem> cartItemOpt = cartItemRepository.findById(cartItemId);
        if (cartItemOpt.isPresent()) {
            CartItem cartItem = cartItemOpt.get();
            cartItem.setQuantity(quantity);
            cartItem.setAddedAt(LocalDateTime.now());
            return cartItemRepository.save(cartItem);
        }
        return null;
    }
}
