package com.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubCicdApplication {

	public static void main(String[] args) {
		System.out.println("Application is running..");
		SpringApplication.run(GithubCicdApplication.class, args);
	}

}
