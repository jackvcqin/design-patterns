package com.example.designpatterns.order.service;

import org.springframework.stereotype.Service;

@Service
public interface IOrderService {

    /**
     * 根据订单不同的订单类型做出不同的处理
     * @param dto
     * @return
     */
    public String handle(OrderDTO dto);
}
