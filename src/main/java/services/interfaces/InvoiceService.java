package services.interfaces;

import models.Invoice;

import java.util.List;

public interface InvoiceService {

    Invoice getById(int id);

    void delete(int id);

    void save(Invoice invoice);

    void update(Invoice invoice, int id);

    void create(Order order);

    void paid(Invoice invoice);

    List<Invoice> getAll();

    List<Invoice> getByOrder(String orderId);
}
