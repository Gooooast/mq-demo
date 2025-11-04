package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MqConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(MqConsumerApp.class, args);
    }
}