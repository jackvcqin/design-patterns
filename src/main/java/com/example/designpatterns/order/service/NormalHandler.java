package com.example.designpatterns.order.service;

import org.springframework.stereotype.Service;

@Service
public class NormalHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理普通订单";
    }
}
