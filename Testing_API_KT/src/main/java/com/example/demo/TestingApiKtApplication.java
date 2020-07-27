package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sneha"})
public class TestingApiKtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingApiKtApplication.class, args);
	}

}
