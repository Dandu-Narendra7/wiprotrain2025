package com.wipro.ordermicroservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // disable CSRF for simplicity (important for POST/PUT/DELETE)
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/cart/**","/cart/add/**","/order/**").permitAll() // allow all product APIs
                .anyRequest().authenticated()
            );

        return http.build();
    }
}
