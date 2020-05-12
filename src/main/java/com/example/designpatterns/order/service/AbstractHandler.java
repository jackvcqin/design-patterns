package com.example.designpatterns.order.service;

import org.springframework.stereotype.Service;

/**
 * 抽象处理器
 */
@Service
public abstract class AbstractHandler {

    abstract public String handle(OrderDTO dto);

}
