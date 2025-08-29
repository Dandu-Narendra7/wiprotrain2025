package com.wipro.User.dto;
import lombok.Data;


@Data
public class Token {
	
	
	String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}


}