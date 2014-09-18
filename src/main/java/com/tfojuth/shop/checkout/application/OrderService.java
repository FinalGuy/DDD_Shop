package com.tfojuth.shop.checkout.application;

import com.tfojuth.shop.checkout.domain.model.cart.Cart;
import com.tfojuth.shop.checkout.domain.model.order.Order;
import com.tfojuth.shop.checkout.domain.model.order.OrderId;
import com.tfojuth.shop.checkout.domain.model.order.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Service
public class OrderService {

    @Inject
    private OrderRepository orderRepository;

    @Transactional
    public Order order(Cart cart) {
        OrderId newOrderId = orderRepository.nextOrderId(); // --> early ID generation.
        Order newOrder = Order.from(cart, newOrderId); // --> publishes domain event.
        orderRepository.add(newOrder);
        return newOrder;
    }

}
