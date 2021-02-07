package com.example.demoservice;

import com.example.demoservice.util.UserContextFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import javax.servlet.Filter;

@SpringBootApplication
@EnableResourceServer
public class DemoServiceApplication {

//	@Bean
//	public Filter userContextFilter() {
//		return new UserContextFilter();
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceApplication.class, args);
	}

}
