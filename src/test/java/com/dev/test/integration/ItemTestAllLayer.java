package com.dev.test.integration;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.dev.test.repositorry.ItemRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class ItemTestAllLayer {

	@Autowired
	private TestRestTemplate restTemplate;
	
	@MockBean
	private ItemRepository itemRepository;
	
	@Test
	public void TestItemsRestApi() throws JSONException{
		String response = this.restTemplate.getForObject("/api/items", String.class);
		JSONAssert.assertEquals("{idItem:10}",response, false);
	}
}
