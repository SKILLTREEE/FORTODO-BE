package com.example.demo.config;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.method.configuration.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.web.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:3000") // React 앱이 실행되는 URL
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
						.allowedHeaders("*")
						.allowCredentials(true);
			}
		};
	}
}
