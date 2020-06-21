package com.hh.orderservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {


    @RequestMapping("order")

    private String getOrder(){
        return "order list";
    }


}
