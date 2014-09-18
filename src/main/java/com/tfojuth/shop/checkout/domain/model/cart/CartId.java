package com.tfojuth.shop.checkout.domain.model.cart;

import com.tfojuth.shop._common.ValueObject;

import java.util.UUID;

public class CartId implements ValueObject {

    private final String id;

    public CartId() {
        this.id = UUID.randomUUID().toString();
    }

    // NOTE: Not using "toString()" here by contract (i.e. not to rely production code on implementation of toString).
    public String asString() {
        return id;
    }
}
