package models;

import java.models;


public class Invoice {

    private String id;

    private int amount;

    private Order order;

    private Boolean paid;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void getOrder(){
        return order;
    }

    public void setOrder(Order order){
        this.order=order;
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
        return "Invoice{" +
                "id=" + id +
                ", amount='" + amount + '\''+
                ", order id='" + order.getId() + '\''

                '}';
    }


}