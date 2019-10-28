package com.arumosam.arumosamweb.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServise {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Orders> getAllOrders(){
		List<Orders> orders = new ArrayList<>();
		orderRepository.findAll().forEach(orders::add);
		return orders;
	}
	
	public Optional<Orders> getOrder(int id) {
		//int orderNo = Integer.parseInt(id);
		return orderRepository.findById(id);
		
	}
	
	public void addOrder(Orders orders) {
		orderRepository.save(orders);
	}
	
	public void updateOrder(int id, Orders orders) {
		orderRepository.save(orders);
	}
	
	public void deleteOrder(int id) {
		//int orderNo = Integer.parseInt(id);
		orderRepository.deleteById(id);
	}
}
