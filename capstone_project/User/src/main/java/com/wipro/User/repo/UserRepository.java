package com.wipro.User.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.User.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmailAndPassWord(String email,String passWord);
	User findByEmail(String userName);
   
}
