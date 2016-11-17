package repositories.interfaces;

import models.Order;

import java.util.List;

public class OrderService {

    Order getById(int id) {
    //...
    };

    void delete(int id) {
    //...
    };

    void save(Order order) {
    //...
    };
    
    void update(Order order, int id) {
    //...
    };

    List<Order> getAll() {
    //...
    };

}
