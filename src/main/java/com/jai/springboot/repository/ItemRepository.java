package com.jai.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jai.springboot.model.Item;


public interface ItemRepository extends JpaRepository<Item, Long> {
	
	
	

}
