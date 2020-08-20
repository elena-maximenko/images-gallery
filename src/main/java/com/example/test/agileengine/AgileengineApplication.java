package com.example.test.agileengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AgileengineApplication {
    public static void main(String[] args) {
        SpringApplication.run(AgileengineApplication.class, args);
    }
}
