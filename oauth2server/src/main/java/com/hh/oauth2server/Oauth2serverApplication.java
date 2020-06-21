package com.hh.oauth2server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan(value = "com.hh.oauth2server.mapper")
@EnableDiscoveryClient(autoRegister = false)
@SpringBootApplication
public class Oauth2serverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2serverApplication.class, args);
    }

}
