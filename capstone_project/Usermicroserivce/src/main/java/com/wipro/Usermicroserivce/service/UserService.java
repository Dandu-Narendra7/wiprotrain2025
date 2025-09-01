package com.wipro.Usermicroserivce.service;

import java.util.List;

import com.wipro.Usermicroserivce.Dto.UserDTO;
import com.wipro.Usermicroserivce.entity.User;
import com.wipro.Usermicroserivce.Dto.*;



public interface UserService {
 	User registerUser(UserDTO userDTO);
    
 	User updateUser(Long id, UserDTO userDTO);
    
 	void deleteUser(Long id);
    
 	List<User> getAllUsers();
    
 	User getUserById(Long id);
    
 	User getUserByUsername(String username);
    
 	Token login(UserDTO userDTO);

}