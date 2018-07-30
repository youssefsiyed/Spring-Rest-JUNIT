package com.dev.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dev.test.bean.Item;
import com.dev.test.repositorry.ItemRepository;

@Component
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public Item retriveItems() {
		return new Item(10,"ADIAS",20,55);
	}
	public List<Item> retriveALLItems() {
		List<Item> items = itemRepository.findAll();
		return items;
	}

}
