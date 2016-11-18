package services.interfaces;

import models.*;
import repositories.interfaces.ChargeRepository;
import services.interfaces.InvoiceService;
import services.interfaces.PaymentService;
import java.util.List;

public class ChargeService {
	private InvoiceService invoiceService;

    private ChargeRepository chargeRepository;
    
    private PaymentService paymentService;

    Charge getById(String id) {
        return chargeRepository.getById(id);
    };

    void delete(String id) {
        chargeRepository.delete(id);
    };

    void save(Charge charge) {
        chargeRepository.save(charge);
    };

    void create(Invoice invoice){
        Charge charge = new Charge;
        charge.setId(invoice.getId());
        charge.setAmount(invoice.getAmount());
        //etc
        //create Stripe Charge. Probably not the correct implementation.
        Charge.create(charge);
        
        //save to db
        save(charge);

    };

    void update(Charge charge, String id){
        chargeRepository.update(charge, id);
    };

    void paid(Charge charge){
    //call this when a payment is made through Stripe
    Invoice invoice = invoiceService.getById(charge.getInvoice());
    invoiceService.paid(invoice);
    paymentService.create(charge);
    
    update(charge, charge.getId());
    };

    List<Charge> getAll() {
        return chargeRepository.getAll();
    };

   Charge getByInvoice(String invoiceId) {
        return chargeRepository.getByInvoice(invoiceId);
    };
}
