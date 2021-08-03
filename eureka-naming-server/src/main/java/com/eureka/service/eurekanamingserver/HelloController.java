package com.eureka.service.eurekanamingserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    final Hello hello;

    public HelloController(Hello hello) {
        this.hello = hello;
    }

    @GetMapping("/hello")
    public Hello sayHello() {
        return hello;
    }
}
