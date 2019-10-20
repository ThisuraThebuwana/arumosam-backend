package com.arumosam.arumosamweb.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServise {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getAllItems(){
		List<Item> items = new ArrayList<>();
		itemRepository.findAll().forEach(items::add);
		return items;
	}
	
	public Optional<Item> getItem(int id) {
		//int itemNo = Integer.parseInt(id);
		return itemRepository.findById(id);
		
	}
	
	public void addItem(Item item) {
		itemRepository.save(item);
	}
	
	public void updateItem(int id, Item item) {
		itemRepository.save(item);
	}
	
	public void deleteItem(int id) {
		//int itemNo = Integer.parseInt(id);
		itemRepository.deleteById(id);
	}
}
