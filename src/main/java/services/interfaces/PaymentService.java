package services.interfaces;

import models.Payment;
import models.Charge;

import java.util.List;

public interface PaymentService {

    Payment getById(String id);

    void delete(String id);

    void createPayment(Charge charge);
    
    void save(Payment payment);
    
    void update(Payment payment, String id);

    List<Payment> getAll();
}
