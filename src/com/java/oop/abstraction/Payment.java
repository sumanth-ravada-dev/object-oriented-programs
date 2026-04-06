package com.java.oop.abstraction;

public abstract class Payment {

    String id;
    String customerName;
    String paymentDate;
    String mode;

    Payment(String id,String customerName,String paymentDate,String mode)
    {
        this.id=id;
        this.customerName=customerName;
        this.paymentDate=paymentDate;
        this.mode=mode;
    }
    public abstract boolean pay(double amount);

    public void otpValidation(int otp){
        System.out.println("Otp Validation done "+otp);
    }
    public void paymentDetails(){
        System.out.println("Customer Id "+id);
        System.out.println("Customer Name "+customerName);
        System.out.println("Payment Date "+paymentDate);
        System.out.println("Payment Mode "+mode);
    }
}
