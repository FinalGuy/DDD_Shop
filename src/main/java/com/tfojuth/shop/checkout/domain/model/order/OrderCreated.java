package com.tfojuth.shop.checkout.domain.model.order;

import com.tfojuth.shop._common.event.DomainEvent;

public class OrderCreated extends DomainEvent {

    public OrderCreated(Order order) {
    }
}
