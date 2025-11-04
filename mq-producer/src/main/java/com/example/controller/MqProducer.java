package com.example.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqProducer implements CommandLineRunner{
    private final RabbitTemplate rabbitTemplate;

    public MqProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        rabbitTemplate.convertAndSend("demoQueue", "Hello RabbitMQ!");
        System.out.println("[x] Sent 'Hello RabbitMQ!'");
    }
}
