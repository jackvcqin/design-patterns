package com.example.designpatterns.order.service;

import org.springframework.stereotype.Service;

@Service
public class PromotionHandler extends AbstractHandler{

    @Override
    public String handle(OrderDTO dto) {
        return "处理促销订单";
    }
}
