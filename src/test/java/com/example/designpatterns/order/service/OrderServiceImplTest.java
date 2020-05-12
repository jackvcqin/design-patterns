package com.example.designpatterns.order.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderServiceImplTest {

    @Qualifier("orderServiceImpl")
    @Autowired
    private IOrderService orderService;

    @Test
    void handle() {
        OrderDTO dto = new OrderDTO();
        dto.setType("3");
        System.out.println(orderService.handle(dto));;
    }
}