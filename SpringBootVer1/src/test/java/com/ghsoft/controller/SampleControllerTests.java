package com.ghsoft.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@WebMvcTest//@SpringBootTest
public class SampleControllerTests {


	@Autowired
	MockMvc mock;
	
	
	@Test
	public void testHello() throws Exception {
		mock.perform(get("/hello")).andExpect( content().string("hello world!"));
	}
}