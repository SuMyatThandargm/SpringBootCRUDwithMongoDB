package com.ecommerce.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.order.model.Item;
import com.ecommerce.order.repository.ItemRepository;
@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
public Item addItem(Item item) {
	return itemRepository.save(item);
	
}
public void deleteItem(int id) {
    itemRepository.deleteById(id);
}
public Item updateItem(Item item,int id) throws Exception {
	Optional<Item> optionalItem = itemRepository.findById(id);
    Item newItem = optionalItem.get();
    newItem.setId(item.getId());
    newItem.setItemNo(item.getItemNum());
    newItem.setItemName(item.getItemName());
    newItem.setItemDescription(item.getItemDescription());
    newItem.setItemstatus(item.getItemstatus());
    newItem.setCategory(item.getCategory());
    return itemRepository.save(newItem);
}
public List<Item> findAllItem(){
	return itemRepository.findAll();
}
}
