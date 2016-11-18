package src.main.java.services.impl;

import models.Payment;
import models.Charge;
import repositories.interfaces.PaymentRepository;


import java.util.List;

public class PaymentService {

	private PaymentRepository paymentRepository;
	private InvoiceService invoiceService;
    Payment getById(String id) {
    	return paymentRepository.getById(id);
    };

    void delete(String id) {
    	paymentRepository.delete(id);
    	
    };

    void createPayment(Charge charge) {
        Payment payment = new Payment;
        //create payment from charge
    	save(payment);
    };

    void save(Payment payment) {
    	paymentRepository.save(payment);
    };

    void update(Payment payment, String id) {
    	paymentRepository.update(payment, id);
    };


    List<Payment> getAll() {
    	return paymentRepository.getAll();
    };

}
