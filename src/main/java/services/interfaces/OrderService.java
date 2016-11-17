package services.interfaces;

import models.Order;

import java.util.List;

public interface OrderService {

    Order getById(int id);

    void delete(int id);

    void createOrder(Order order);
    
    void save(Order order);
    
    void update(Order order);

    List<Order> getAll();
}
