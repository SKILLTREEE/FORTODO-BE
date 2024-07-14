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
		http
				.csrf(csrf -> csrf.disable()) // csrf 비활성화 설정
				.authorizeHttpRequests(authz -> authz
						.anyRequest().permitAll() // 모든 요청 허용
				);

		return http.build();
		
	}
}
