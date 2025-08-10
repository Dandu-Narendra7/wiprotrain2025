package com.wipro.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
	@GetMapping("/centigrate/{fahrenheit}")
	String toCentigrade(@PathVariable double fahrenheit)
	{
		
		return String.format("%.2f°F is %.2f°C", fahrenheit, centigrade);
	}
	
	

}
