package com.example.demo;



import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication

@RestController

public class SbDockerGlApplication {



 public static void main(String[] args) {

 SpringApplication.run(SbDockerGlApplication.class, args);

 }

	

 @GetMapping("/hello")

 public String sayHi()

 {

 return "Welcome To Docker Application Aditya Singh";

 }



}