package src.main.java.repositories.interfaces;

import models.Payment;

import java.util.List;

public interface PaymentService {

    Payment getById(String id);

    void delete(String id);
    
    void save(Payment payment);
    
    void update(Payment payment, String id);

    List<Payment> getAll();
}
