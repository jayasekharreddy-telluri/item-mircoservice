package com.jai.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jai.springboot.dto.Voucher;
import com.jai.springboot.model.Item;
import com.jai.springboot.repository.ItemRepository;


@RestController
@RequestMapping("/items")
public class ItemController {
	
	@Autowired
	ItemRepository itemRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${voucherService.url}")
	private String voucherServiceUrl;
	
	@PostMapping
	public Item create(@RequestBody Item item) {
		
		Voucher voucher = restTemplate.getForObject(voucherServiceUrl+item.getVoucherCode(), Voucher.class);
		item.setPrice(item.getPrice().subtract(voucher.getDiscount()));
		
		return itemRepository.save(item);
		
	}


}
