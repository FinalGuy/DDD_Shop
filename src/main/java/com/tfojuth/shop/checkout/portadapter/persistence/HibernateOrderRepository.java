package com.tfojuth.shop.checkout.portadapter.persistence;

import com.tfojuth.shop.checkout.domain.model.order.Order;
import com.tfojuth.shop.checkout.domain.model.order.OrderId;
import com.tfojuth.shop.checkout.domain.model.order.OrderRepository;

public class HibernateOrderRepository implements OrderRepository {

    @Override
    public OrderId nextOrderId() {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    @Override
    public void add(Order order) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }
}
