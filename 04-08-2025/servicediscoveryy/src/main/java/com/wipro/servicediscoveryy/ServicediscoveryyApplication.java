package com.wipro.servicediscoveryy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicediscoveryyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicediscoveryyApplication.class, args);
	}

}
