package com.dev.test.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.dev.test.controller.RestGreetings;

@RunWith(SpringRunner.class)
@WebMvcTest(value=RestGreetings.class)

public class GreetingsTestController {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void GreetingTest() throws Exception{
		// request the path /hello using format application/json
		RequestBuilder request = MockMvcRequestBuilders.get("/api/hello").accept(MediaType.APPLICATION_JSON);
		MvcResult reqResult = mockMvc.perform(request)
				    				 .andExpect(status().isOk())
				    				 .andExpect(content().string("Welcome Back"))
				    				 .andReturn();
		
		// verify the response
		// assertEquals("Welcome Back", reqResult.getResponse().getContentAsString());
	}
}
