package com.wipro.Usermicroserivce.tokens;

public class JwtResponse {
     String token;
     Long userId;
     String username;
     String role;
    
    public JwtResponse(String token, Long userId, String username, String role) {
        this.token = token;
        this.userId = userId;
        this.username = username;
        this.role = role;
    }
}