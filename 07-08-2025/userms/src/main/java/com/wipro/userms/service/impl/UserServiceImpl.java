package com.wipro.userms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.wipro.userms.entity.User;
import com.wipro.userms.repo.UserRepo;
import com.wipro.userms.service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo userRepo;
	@Autowired
	RestTemplate restTemplate;
	@CircuitBreaker(name = "user-cb", fallbackMethod = "handleFallBack")
	public void save(User user) {

	}

}
