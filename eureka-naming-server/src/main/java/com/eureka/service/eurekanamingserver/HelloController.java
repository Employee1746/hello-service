package com.eureka.service.eurekanamingserver;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public HelloController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/hello")
    public String sayHello() {
        kafkaTemplate.send("hello", "Добрый день");
        return "Добрый день";
    }
}


