package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableEurekaClient
@RestController
public class SbgleClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbgleClientApplication.class, args);
	}
	@GetMapping
	public String hi()
	{
		return "Eureka Client Aditya Singh ........Application";
	}

}
