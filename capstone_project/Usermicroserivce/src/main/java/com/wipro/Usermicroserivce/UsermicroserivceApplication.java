package com.wipro.Usermicroserivce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UsermicroserivceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermicroserivceApplication.class, args);
	}

}
