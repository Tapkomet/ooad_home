package repositories.interfaces;

import models.Charge;

import java.util.List;

public interface ChargeService {

    Charge getById(int id);

    void delete(int id);

    void save(Charge charge);

    void update(Charge charge, int id);

    List<Charge> getAll();

    List<Charge> getByInvoice(String invoiceId);
}
