package com.wipro.userms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.userms.entity.User;
import com.wipro.userms.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping
	void save(@RequestBody User user)
	{
		
		userService.save(user);
		
		
	}

	@GetMapping
	List<User> findAll()
	{
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUser(id);
	}

}
