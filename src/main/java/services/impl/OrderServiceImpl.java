package src.main.java.services.impl;

import models.Order;
import services.interfaces.InvoiceService;
import repositories.interfaces.OrderRepository;

import java.util.List;

public class OrderService {

	private OrderRepository orderRepository;
	private InvoiceService invoiceService;
    Order getById(int id) {

    	return orderRepository.getById(id);
    	
    };

    void delete(int id) {
    	orderRepository.delete(id);
    	
    };

    void createOrder(Order order) {
        invoiceService.createFromOrder(order);
    	save(order);
    };

    void save(Order order) {
    	orderRepository.save(order);
    };

    void update(Order order, int id) {
    	orderRepository.update(order, id);
    };

     void done(Order order) {
        order.complete=true;
        update(order, order.getId());
     };

    List<Order> getAll() {
    	return orderRepository.getAll();
    };

}
