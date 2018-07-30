package com.dev.test.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dev.test.bean.Item;
import com.dev.test.repositorry.ItemRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {

	@Autowired
	private ItemRepository itemRepository;
	
	@Test
	public void ItemRepoTestingFindAll(){
		List<Item> items = itemRepository.findAll();
		
		// how many data in H2 database
		assertEquals(0,items.size());
	}
}
