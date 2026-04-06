package com.java.oop.abstraction;

public class UpiPayment extends Payment{

    UpiPayment(String id, String customerName, String paymentDate, String mode) {
        super(id, customerName, paymentDate, mode);
    }

    @Override
    public boolean pay(double amount) {
        super.paymentDetails();
        System.out.println("Payment done using UPI");
        return true;
    }
}
