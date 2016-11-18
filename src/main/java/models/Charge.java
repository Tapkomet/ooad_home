package models;

import java.models;


public class Charge {

    private String id;

    private int amount;

    private String invoice;

    private Boolean paid;



    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getInvoice(){
        return invoice;
    }

    public void setInvoice(String invoice){
        this.invoice=invoice;
    }

     public Boolean getPaid() {
         return paid;
        }

     public void setPaid(Boolean paid) {
         this.paid = paid;
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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