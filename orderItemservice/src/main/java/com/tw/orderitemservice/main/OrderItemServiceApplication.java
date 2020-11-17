package com.tw.orderitemservice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Collections;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableJpaRepositories
public class OrderItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(OrderItemServiceApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.application.name", "order-item-service"));
		app.run(args);
	}

}
