package com.tfojuth.shop.checkout.domain.model.order;

public interface OrderRepository {

    /**
     * Example for early (i.e. application side) ID generation.
     *
     * @return The next OrderId to use.
     */
    OrderId nextOrderId();

    void add(Order order);


}
