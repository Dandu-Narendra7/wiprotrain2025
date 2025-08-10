package com.wipro.userms.service;

import java.util.List;

import com.wipro.userms.entity.User;

public interface UserService {
	void save(User user);
	List<User> findAll();
}
