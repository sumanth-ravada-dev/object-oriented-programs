package com.java.oop.interfaces;

public class CashOnDeliveryPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        Payment.validTransaction(3,amount);
        System.out.println("Payment done successfully: "+amount);
        return true;
    }
    @Override
    public boolean pay(String customerId, double amount) {
        return false;
    }
}
