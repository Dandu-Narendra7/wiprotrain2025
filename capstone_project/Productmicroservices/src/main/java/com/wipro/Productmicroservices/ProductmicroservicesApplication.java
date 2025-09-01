package com.wipro.Productmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductmicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductmicroservicesApplication.class, args);
	}

}
