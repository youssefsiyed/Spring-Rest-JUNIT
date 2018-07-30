package com.dev.test.repositorry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.test.bean.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
