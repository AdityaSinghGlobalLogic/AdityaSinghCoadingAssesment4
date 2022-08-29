package com.example.demo.controllers;



import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
@RestController

public class TestController {


 
 @RequestMapping(value = "/student", method = RequestMethod.GET)
 public Student firstPage()
 {
	 Student student=new Student();
	 student.setStuName("stu1");
	 student.setStuClass("First");
	 student.setStuId("1");
	 student.setStuFee(3000);
	return student;
	 
 }
 

}

