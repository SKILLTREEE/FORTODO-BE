package com.example.demo.config;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.method.configuration.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.web.*;

@Configuration
@EnableMethodSecurity
public class CustomConfig {

	@Bean
	public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
		// 초반 작업 일단 누구나 로그인 없이 들어올 수 있도록 작업
		http.csrf().disable();
		http.authorizeHttpRequests().anyRequest().permitAll();
		
		return http.build();
		
	}
}
