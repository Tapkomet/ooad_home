package repositories.interfaces;

import models.Payment;

import java.util.List;

public class PaymentService {

    Payment getById(String id) {
    //...
    };

    void delete(String id) {
    //...
    };

    void save(Payment payment) {
    //...
    };
    
    void update(Payment payment, String id) {
    //...
    };

    List<Payment> getAll() {
    //...
    };

}
