package com.example.designpatterns.order.strategy;

import com.example.designpatterns.order.entity.OrderDTO;
import org.springframework.stereotype.Component;

@Component
public class NormalHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理普通订单";
    }
}
