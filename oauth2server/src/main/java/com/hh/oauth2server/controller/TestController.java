package com.hh.oauth2server.controller;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(@CookieValue() String JSESSIONID,HttpSession session){
        ToStringBuilder.reflectionToString(session);
        System.out.println(JSESSIONID);
        return JSESSIONID;
    }

}
