package com.example.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MqConsumer {

    @RabbitListener(queues = "demoQueue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
