package com.example.designpatterns.order.strategy;

import com.example.designpatterns.order.entity.OrderDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 抽象处理器
 */
@Component
public abstract class AbstractHandler {

    abstract public String handle(OrderDTO dto);

}
