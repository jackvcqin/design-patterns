package com.example.designpatterns.order.service;

import com.example.designpatterns.order.entity.OrderDTO;
import com.example.designpatterns.order.strategy.HandlerProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private HandlerProcessor handlerProcessor;

    @Override
    public String handle(OrderDTO dto) {
        return handlerProcessor.getInstance(dto.getType()).handle(dto);
    }
}
