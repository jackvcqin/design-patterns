package com.example.designpatterns.order.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GroupHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理团购订单";
    }
}
