package com.dev.test.dao;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.dev.test.bean.Item;
import com.dev.test.repositorry.ItemRepository;
import com.dev.test.service.ItemService;

@RunWith(MockitoJUnitRunner.class)
public class ItemTestDao {

	@InjectMocks
	private ItemService itemservice;
	
	@Mock
	private ItemRepository itemRepository;
	
	@Test
	public void itemDaoTest(){
		when(itemRepository.findAll()).thenReturn(Arrays.asList(new Item(10,"ADIAS",20,55),new Item(2,"item2",20,20)));
		List<Item> retriveALLItems = itemservice.retriveALLItems();
		
		/// compaire between value of item[1] in repository and service
		assertEquals(0, retriveALLItems.get(0).getValue());
	}
}
