package services.interfaces;

import models.Invoice;
import repositories.interfaces.ChargeRepository;
import java.util.List;

public class InvoiceService {

    private InvoiceRepository InvoiceRepository;

    Invoice getById(int id) {
        return invoiceRepository.getById(id);
    };

    void delete(int id) {
        invoiceRepository.delete(id);
    };

    void save(Invoice invoice) {
        invoiceRepository.save(invoice);
    };

    void create(Order order){
        Invoice invoice = new Invoice;
        invoice.setId(order.getId());
        invoice.setAmount(order.getAmount());
        //etc

        save(invoice);

    };

    void update(Invoice invoice, int id){
        invoiceRepository.update(invoice, id);
    };

    void paid(Invoice invoice){
    invoice.setPaid(true);
    update(invoice, invoice.getId());
    };

    List<Invoice> getAll() {
        return invoiceRepository.getAll();
    };

    List<Invoice> getByOrder(String orderId) {
        return invoiceRepository.getByOrder(orderId);
    };
}
