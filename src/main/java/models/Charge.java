package models;

import java.models;


public class Charge {

    private String id;

    private int amount;

    private Invoice invoice;

    private Boolean paid;



    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void getInvoice(){
        return invoice;
    }

    public void setInvoice(Invoice invoice){
        this.invoice=invoice;
    }

     public Boolean getPaid() {
         return paid;
        }

     public void setPaid(Boolean paid) {
         this.paid = paid;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
            this.id = id;
        }

    @Override
    public String toString() {
        return "Charge{" +
                "id=" + id +
                ", amount='" + amount + '\''+
                ", invoice id='" + invoice.getId() + '\''

                '}';
    }


}