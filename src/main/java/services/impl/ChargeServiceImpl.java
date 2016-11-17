package services.interfaces;

import models.Charge;
import repositories.interfaces.ChargeRepository;
import java.util.List;

public class ChargeService {

    private ChargeRepository chargeRepository;

    Charge getById(int id) {
        return chargeRepository.getById(id);
    };

    void delete(int id) {
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

        save(charge);

    };

    void update(Charge charge, int id){
        chargeRepository.update(charge, id);
    };

    void paid(Charge charge){
    charge.setPaid(true);
    update(charge, charge.getId());
    };

    List<Charge> getAll() {
        return chargeRepository.getAll();
    };

    List<Charge> getByInvoice(String invoiceId) {
        return chargeRepository.getByInvoice(invoiceId);
    };
}
