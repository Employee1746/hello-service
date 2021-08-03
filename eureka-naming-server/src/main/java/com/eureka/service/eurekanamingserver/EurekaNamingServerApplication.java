package com.eureka.service.eurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingServerApplication.class, args);
	}

	@Bean(name = "hello")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMessage("Добрый день");
		return hello;
	}
}
