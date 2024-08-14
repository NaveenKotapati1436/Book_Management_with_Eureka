package com.ust.author_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class AuthorServiceApplication {
	private EnableEurekaClient enableEurekaClient;
	public static void main(String[] args) {
		SpringApplication.run(AuthorServiceApplication.class, args);
	}

}
