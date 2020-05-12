package com.example.designpatterns.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {

    private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @RequestMapping("/list")
    public String list(){
        String resultStr = UUID.randomUUID().toString();
        logger.info("---------"+resultStr+"--------");
        return resultStr;
    }
}
