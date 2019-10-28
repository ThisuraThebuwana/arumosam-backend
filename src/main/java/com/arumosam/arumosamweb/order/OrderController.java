package com.arumosam.arumosamweb.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
	
	@Autowired
	private OrderServise orderServise;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/orders")
	public List<Orders> getAllOrders(){
		return orderServise.getAllOrders();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping ("/orders/{id}")
	public Optional<Orders> getOrder(@PathVariable int id){
		return orderServise.getOrder(id);
	}

	@RequestMapping (method=RequestMethod.POST, value="/orders")
	public void addOrder(@RequestBody Orders orders) {
		orderServise.addOrder(orders);
	}
	
	@RequestMapping (method=RequestMethod.PUT, value="/orders/{id}")
	public void updateOrder(@RequestBody Orders orders, @PathVariable int id) {
		orderServise.updateOrder(id, orders);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping (method=RequestMethod.DELETE, value="/orders/{id}")
	public void deleteOrder(@PathVariable int id) {
		orderServise.deleteOrder(id);
	}
	
}
