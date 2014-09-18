package com.tfojuth.shop.checkout.domain.model.cart;

import com.tfojuth.shop.ValueObject;

public class CartId implements ValueObject {

    private String id;

    public CartId(String id) {
        this.id = id;
    }
}
