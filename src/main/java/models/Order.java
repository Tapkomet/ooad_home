package models;

import java.models;


public class Order {

    private String id;

    private int amount;

    private String payMethod;

    private Boolean complete;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Boolean getComplete() {
         return complete;
        }

     public void setComplete(Boolean complete) {
         this.complete = complete;
        }

    public String getPayMethod() {
            return payMethod;
        }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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