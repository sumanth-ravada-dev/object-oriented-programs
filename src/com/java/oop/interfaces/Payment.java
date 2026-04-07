package com.java.oop.interfaces;

public interface Payment {
    //public static final
    int MAX_PAYMENT_AMOUNT=10000;
    int MAX_TRANSACTIONS_ALLOWED=3;
    //abstract methods
    //public abstract
    boolean pay(double amount);
    boolean pay(String customerId,double amount);
    default void otpValidation(int otp){
        System.out.println("OTP Validation done : "+otp);
    }
    static boolean validTransaction(int myTransactionsAllowed,double paymentAmount){
        return (myTransactionsAllowed<=MAX_TRANSACTIONS_ALLOWED && paymentAmount<=MAX_PAYMENT_AMOUNT);
    }
}
