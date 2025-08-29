package com.wipro.User.service.impl;


import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import com.wipro.User.dto.Token;
import com.wipro.User.entity.User;
import com.wipro.User.repo.UserRepository;
import com.wipro.User.service.UserService;
import com.wipro.User.util.AppConstant;
import com.wipro.User.util.EncryptUtil;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		Optional<User> userOpt= userRepository.findById(id);
		if(userOpt.isPresent())
		{
			return userOpt.get();
		}
		return null;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public Token login(User user) {
		// TODO Auto-generated method stub
		User userSalt=userRepository.findByEmail(user.getEmail());
		
		System.out.println("db salt="+userSalt);
		String encrypTestPassword= EncryptUtil.getEncryptedPassword(user.getPassWord(),userSalt.getSalt());
		User userData=userRepository.findByEmailAndPassWord(user.getEmail(),encrypTestPassword);
		if(userData!=null)
		{
			String userId= String.valueOf(userData.getId());
//			System.out.println(getJWTToken(user.getEmail())); 
			String jwtToken="Bearer " + getJWTToken(userId);
			System.out.println("token="+jwtToken);
			Token token=new Token();
			token.setToken(jwtToken);
			return token;
		}
		return null;
	}
	
	

	 private String getJWTToken(String userId) {
	        Key key = Keys.hmacShaKeyFor(Base64.getDecoder().decode(AppConstant.SECRET));
		 	List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

	        return Jwts.builder()
	                .setId("jwtExample")
	                .setSubject(userId)
	                .claim("authorities", grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
	                .setIssuedAt(new Date())
	                .setExpiration(new Date(System.currentTimeMillis() + 600000))
	                .signWith(key)
	                .compact();
	    }

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

}