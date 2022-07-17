package com.ecommerce.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.order.model.Item;
import com.ecommerce.order.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/helloitem")
	public String hello() {
		return "Hello!..Welcome to ItemController";
	}
	@PostMapping("/additem")
	public ResponseEntity<Item> addItem(@RequestBody Item item){
		itemService.addItem(item);
		return ResponseEntity.ok(itemService.addItem(item));
		
	}
	@GetMapping("/getAllItem")
	public ResponseEntity getAllItems() {
		return ResponseEntity.ok(itemService.findAllItem());
	}
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deleteItem/{id}")
	public ResponseEntity getDeleteItem(@PathVariable int id) {
		itemService.deleteItem(id);
		return ResponseEntity.ok().build();
	}
	@PostMapping("/updateitem/{id}")
	public ResponseEntity<Item> updateItem(@RequestBody Item item,@PathVariable int id) throws Exception{
		return ResponseEntity.ok(itemService.updateItem(item, id));
		
	}
	

}
