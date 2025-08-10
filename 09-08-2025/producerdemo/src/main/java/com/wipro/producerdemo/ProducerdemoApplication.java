package com.wipro.producerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ProducerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerdemoApplication.class, args);
	}

}
