package repositories.interfaces;

import models.Invoice;

import java.util.List;

public class InvoiceService {

    Invoice getById(int id) {
    //...
    };

    void delete(int id) {
    //...
    };

    void save(Invoice invoice) {
    //...
    };

    void update(Invoice invoice, int id) {
    //...
    };

    List<Invoice> getAll() {
    //...
    };

    List<Invoice> getByOrder(String orderId) {
    //...
    };
}
