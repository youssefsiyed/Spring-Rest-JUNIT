package com.dev.test.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.dev.test.bean.Item;
import com.dev.test.controller.RestItems;
import com.dev.test.service.ItemService;

@RunWith(SpringRunner.class)
@WebMvcTest(value=RestItems.class)
public class ItemTestController {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ItemService itemservice;
	
	
	@Test
	public void TestItems() throws Exception{
		RequestBuilder request= MockMvcRequestBuilders.get("/api/items").accept(MediaType.APPLICATION_JSON);
		MvcResult Result = mockMvc.perform(request)
							      .andExpect(status().isOk())
							      .andExpect(content().json("{\"idItem\":10,\"nameItem\":\"ADIAS\",\"priceItem\":20,\"quantiyItem\":55}"))
				                  .andReturn();
	}
	
	///////////////////////////TEST GET METHOD//////////////////////////////////
	@Test
	public void TestItemsDao() throws Exception{
//		when(itemservice.retriveItems()).thenReturn(new Item(10,"ADIAS",20,55));
		when(itemservice.retriveALLItems()).thenReturn(Arrays.asList(new Item(10,"ADIAS",20,55),new Item(2,"item2",20,20)));
		RequestBuilder request= MockMvcRequestBuilders.get("/api/items-dao").accept(MediaType.APPLICATION_JSON);
		MvcResult Result = mockMvc.perform(request)
							      .andExpect(status().isOk())
							      .andExpect(content().json("[{idItem:10,nameItem:ADIAS,priceItem:20,quantiyItem:55}"
							      		+ ",{idItem:2,nameItem:item2,priceItem:20,quantiyItem:20}]"))
//							      .andExpect(content().json("[{\"idItem\":10,\"nameItem\":\"ADIAS\",\"priceItem\":20,\"quantiyItem\":55}]"))
				                  .andReturn();
	}
	
	//////////////////////////TEST POST METHOUD///////////////////////////////////
//	@Test
//	public void TestItemsDaoPost() throws Exception{
//		
//		RequestBuilder request= MockMvcRequestBuilders
//													.post("/api/items-dao")
//													.accept(MediaType.APPLICATION_JSON)
//													.content("{\"idItem\":8,\"nameItem\":\"TEST\",\"priceItem\":20,\"quantiyItem\":80}")
//													.contentType(MediaType.APPLICATION_JSON);
//		
//		MvcResult Result = mockMvc.perform(request)
//							      .andExpect(status().isCreated())
//							      .andExpect(header().string("location", containsString("/api/items-dao/")))
//				                  .andReturn();
//	}
}
