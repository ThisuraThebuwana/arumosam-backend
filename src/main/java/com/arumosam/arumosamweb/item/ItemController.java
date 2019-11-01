package com.arumosam.arumosamweb.item;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	
	@Autowired
	private ItemServise itemService;
	
	@CrossOrigin
	@GetMapping("/items")
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
	
	@CrossOrigin
	@GetMapping ("/items/{id}")
	public Optional<Item> getItem(@PathVariable int id){
		return itemService.getItem(id);
	}

	@CrossOrigin
	@RequestMapping (method=RequestMethod.POST, value="/items")
	public void addItem(@RequestBody Item item) {
		itemService.addItem(item);
	}

	@CrossOrigin
	@RequestMapping (method=RequestMethod.PUT, value="/items/{id}")
	public void updateItem(@RequestBody Item item, @PathVariable int id) {
		itemService.updateItem(id, item);
	}
	
	@CrossOrigin
	@RequestMapping (method=RequestMethod.DELETE, value="/items/{id}")
	public void deleteItem(@PathVariable int id) {
		itemService.deleteItem(id);
	}
	
}
