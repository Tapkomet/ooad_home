package services.interfaces;

import models.Order;

import java.util.List;

public interface OrderService {

    Order getById(String id);

    void delete(String id);

    void createOrder(Order order);
    
    void save(Order order);
    
    void update(Order order, String id);

    List<Order> getAll();

    void done(Order order);
}
