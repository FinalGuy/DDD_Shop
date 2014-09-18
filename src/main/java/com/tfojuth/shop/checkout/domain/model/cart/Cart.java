package com.tfojuth.shop.checkout.domain.model.cart;

import com.tfojuth.shop.Entity;

public class Cart implements Entity<CartId> {

    private CartId id;

    @Override
    public CartId id() {
        return id;
    }
}
