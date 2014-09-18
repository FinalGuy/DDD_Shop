package com.tfojuth.shop.checkout.domain.model.order;

import com.tfojuth.shop.Entity;
import com.tfojuth.shop.checkout.domain.model.cart.Cart;
import com.tfojuth.shop.event.DomainEventPublisher;

public class Order implements Entity<OrderId> {

    private final OrderId id;

    public Order(OrderId orderId) {
        this.id = orderId;
    }

    public static Order from(Cart cart, OrderId newOrderId) {
        Order order = new Order(newOrderId);
        DomainEventPublisher.getInstance().publish(new OrderCreated(order));
        return order;
    }

    @Override
    public OrderId id() {
        return id;
    }
}
