package services.interfaces;

import models.Invoice;

import java.util.List;

public interface InvoiceService {

    Invoice getById(String id);

    void delete(String id);

    void save(Invoice invoice);

    void update(Invoice invoice, String id);

    void create(Order order);

    void paid(Invoice invoice);

    List<Invoice> getAll();

    List<Invoice> getByOrder(String orderId);
}
