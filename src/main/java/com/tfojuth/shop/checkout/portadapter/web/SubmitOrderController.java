package com.tfojuth.shop.checkout.portadapter.web;

import com.tfojuth.shop.checkout.application.OrderService;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;

@Controller
public class SubmitOrderController {

    @Inject
    private OrderService orderService;

}
