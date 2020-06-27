package com.hh.orderservice.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {


    @RequestMapping("/order")
    @PreAuthorize("hasAnyAuthority('order:query')")
    public String getOrder(){
        return "order list";
    }


}
