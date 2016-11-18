package models;

import java.models;


public class Payment {

    private String id;

    private int amount;

    private String paymentType;
	
	private Charge charge;
	
	private String creditCard;

    private Boolean complete;

    public String getAmount() {
        return amount;
    }
	   
    
	public Payment(Charge charge, String creditCard, Double amount) {
        this.charge = charge;
        this.creditCard = creditCard;
        this.amount = amount;
        
    }
	
       public void fail() {
        this.complete = Boolean.FALSE;
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


    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Boolean getComplete() {
         return complete;
        }

     
    public String getId() {
        return id;
    }

    public void setId(String id) {
            this.id = id;
        }

   

}