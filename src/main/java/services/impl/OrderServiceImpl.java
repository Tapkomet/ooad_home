package src.main.java.services.impl;

import models.Order;
import services.interfaces.InvoiceService;
import repositories.interfaces.OrderRepository;


import java.util.List;

public class OrderService {

	private OrderRepository orderRepository;
	private InvoiceService invoiceService;
    Order getById(String id) {
    	return orderRepository.getById(id);
    };

    void delete(String id) {
    	orderRepository.delete(id);
    	
    };

    void createOrder(Order order) {
        invoiceService.createFromOrder(order);
    	save(order);
    };

    void save(Order order) {
    	orderRepository.save(order);
    };

    void update(Order order, String id) {
    	orderRepository.update(order, id);
    };

     void done(Order order) {
        order.setComplete(true);
        update(order, order.getId());
     };

    List<Order> getAll() {
    	return orderRepository.getAll();
    };

}
