package src.main.java.services.impl;

import models.Order;
import repositories.interfaces.OrderRepository;

import java.util.List;

public class OrderService {

	private OrderRepository orderRepository;
    Order getById(int id) {

    	return orderRepository.getById(id);
    	
    };

    void delete(int id) {
    	return orderRepository.delete(id);
    	
    };

    void createOrder(Order order) {

    	save(order);
    	
    };
    
    void save(Order order) {
    	return orderRepository.save(order);
    };
    
    void update(Order order) {
    	return orderRepository.update(order);
    };

    List<Order> getAll() {
    	return orderRepository.getAll();
    };

}
