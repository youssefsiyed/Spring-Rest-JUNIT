package com.dev.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.test.bean.Item;
import com.dev.test.service.ItemService;

@RestController
@RequestMapping(value="/api")
public class RestItems {
	
	@Autowired
	private ItemService itemservice;
	
	///////////////////////////////////////////////
	@GetMapping(value="/items")
	public Item itemsLayout(){
		return new Item(10,"ADIAS",20,55);
	}
	///////////////////////////////////////////////
	@GetMapping(value="/items-dao")
	public List<Item> BuissnesLayout(){
		return itemservice.retriveALLItems();
	}
}
