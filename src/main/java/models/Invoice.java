package models;

import java.models;


public class Invoice {

    private String id;

    private int amount;

    private String order;

    private Boolean paid;
    
    private String payMethod;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getOrder(){
        return order;
    }

    public void setOrder(String order){
        this.order=order;
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
    
    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
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