package services.interfaces;

import repositories.interfaces.ChargeRepository;
import java.util.List;

import models.Invoice;
import models.Order;
import services.interfaces.OrderService;

public class InvoiceService {

    private InvoiceRepository invoiceRepository;
    
    private OrderService orderService;

    Invoice getById(String id) {
        return invoiceRepository.getById(id);
    };

    void delete(String id) {
        invoiceRepository.delete(id);
    };

    void save(Invoice invoice) {
        invoiceRepository.save(invoice);
    };

    void create(Order order){
        Invoice invoice = new Invoice;
        invoice.setOrder(order.getId());
        invoice.setAmount(order.getAmount());
        invoice.setPayMethod(order.getPayMethod());
        //etc
        
        if(invoice.getPayMethod.equals("Stripe")){
        chargeService.create(invoice);
        }
        else{
        	//...
        }
        

        save(invoice);

    };

    void update(Invoice invoice, String id){
        invoiceRepository.update(invoice, id);
    };

    void paid(Invoice invoice){
    
    invoice.setPaid(true);
    Order order = orderService.getByInvoice(invoice.getId());
    orderService.done(order);
    update(invoice, invoice.getId());
    };

    List<Invoice> getAll() {
        return invoiceRepository.getAll();
    };

    List<Invoice> getByOrder(String orderId) {
        return invoiceRepository.getByOrder(orderId);
    };
}
