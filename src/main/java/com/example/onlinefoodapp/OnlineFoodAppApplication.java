package com.example.onlinefoodapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {})
public class OnlineFoodAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineFoodAppApplication.class, args);
    }

}
