package com.wipro.User.service;
import java.util.List;

import com.wipro.User.dto.Token;
import com.wipro.User.entity.User;


public interface UserService {
	List<User> findAll();

	User findById(int id);
	void save(User user);
	Token login(User user);

	void update(User user);

	void deleteById(int id);
}

