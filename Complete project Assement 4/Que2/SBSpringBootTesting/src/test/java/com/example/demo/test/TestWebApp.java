package com.example.demo.test;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import org.springframework.web.context.WebApplicationContext;

public class TestWebApp extends SpringBootHelloWorldTests {

 @Autowired

 private WebApplicationContext webApplicationContext;

 private MockMvc mockMvc;

 @Before

 public void setup() {

 mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

 }

 @Test

 public void testEmployee() throws Exception {

 mockMvc.perform(get("/student")).andExpect(status().isOk())

  .andExpect(content().contentType("application/json;charset=UTF-8"))

  .andExpect(jsonPath("$.stuName").value("stu1")).andExpect(jsonPath("$.stuClass").value("First"))

  .andExpect(jsonPath("$.stuId").value("1")).andExpect(jsonPath("$.stuFee").value(3000));

 }

}