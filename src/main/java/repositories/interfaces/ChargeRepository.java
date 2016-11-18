package repositories.interfaces;

import models.Charge;

import java.util.List;

public interface ChargeService {

    Charge getById(String id);

    void delete(String id);

    void save(Charge charge);

    void update(Charge charge, String id);

    List<Charge> getAll();

    Charge getByInvoice(String invoiceId);
}
