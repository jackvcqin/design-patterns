package com.example.designpatterns.order.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HandlerProcessor {

    public AbstractHandler getInstance(String type){
        AbstractHandler handler;
        if("1".equals(type)){
            handler = new NormalHandler();
        }else if("2".equals(type)){
            handler = new GroupHandler();
        }else if("3".equals(type)){
            handler = new PromotionHandler();
        }else {
            handler = null;
        }
        return handler;
    }
}
