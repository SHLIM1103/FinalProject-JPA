package com.example.demo.sec.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CorsConfig implements WebMvcConfigurer {
	private static final String[] EXCLUDE_PATHS = {
			"/api/user/add",
			"/api/user/login",
			"/user/**",
			"/error/**"
	};
}
