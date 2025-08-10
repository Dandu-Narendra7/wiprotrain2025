package com.wipro.producerdemo.service.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public interface MessageService {
	public static void main(String[] args) {
		SpringApplication.run(MessageService.class, args);
	}

}
