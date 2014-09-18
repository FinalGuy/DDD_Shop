package com.tfojuth.shop.checkout.domain.model.order;

import com.tfojuth.shop._common.Entity;
import com.tfojuth.shop.checkout.domain.model.cart.Cart;
import com.tfojuth.shop.checkout.domain.model.cart.CartInterest;
import com.tfojuth.shop.checkout.domain.model.cart.CartItem;
import com.tfojuth.shop._common.event.DomainEventPublisher;

import java.util.ArrayList;
import java.util.List;

public class Order implements Entity<OrderId>, CartInterest {

    private final OrderId id;
    private final List<OrderItem> orderItems = new ArrayList<OrderItem>();

    public Order(OrderId orderId) {
        this.id = orderId;
    }

    public static Order from(Cart cart, OrderId newOrderId) {
        Order order = new Order(newOrderId);
        cart.provideCartInterest(order);
        DomainEventPublisher.getInstance().publish(new OrderCreated(order));
        return order;
    }

    @Override
    public OrderId id() {
        return id;
    }

    @Override
    public void informCartItem(CartItem cartItem) {
        orderItems.add(new OrderItem(cartItem));
    }
}
