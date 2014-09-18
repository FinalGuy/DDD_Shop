package com.tfojuth.shop.checkout.domain.model.cart;

import com.tfojuth.shop._common.Entity;

import java.util.List;

public class Cart implements Entity<CartId> {

    private CartId id;
    private List<CartItem> cartItems;

    @Override
    public CartId id() {
        return id;
    }

    public void provideCartInterest(CartInterest cartInterest) {
        for (CartItem cartItem : cartItems) {
            cartInterest.informCartItem(cartItem);
        }
        // ... more data ...
    }


}
