package models;

import java.models;


public class Order {

    private String id;

    private int amount;

    private String paymentType;

    private Boolean complete;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Boolean getComplete() {
         return complete;
        }

     public void setComplete(Boolean complete) {
         this.complete = complete;
        }

    public String getPaymentType() {
            return paymentType;
        }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
            this.id = id;
        }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", amount='" + amount + '\'' +
                ", complete='" + complete + '\''+
                '}';
    }


}