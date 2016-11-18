package repositories.interfaces;

import models.Order;

import java.util.List;

public class OrderService {

    Order getById(String id) {
    //...
    };

    void delete(String id) {
    //...
    };

    void save(Order order) {
    //...
    };
    
    void update(Order order, String id) {
    //...
    };

    List<Order> getAll() {
    //...
    };

}
