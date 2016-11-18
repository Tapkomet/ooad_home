package services.interfaces;

import models.Charge;

import java.util.List;

public interface ChargeService {

    Charge getById(String id);

    void delete(String id);

    void save(Charge charge);

    void update(Charge charge, String id);

    void create(Invoice invoice);

    void paid(Charge charge);

    List<Charge> getAll();

    Charge getByInvoice(String invoiceId);
}
