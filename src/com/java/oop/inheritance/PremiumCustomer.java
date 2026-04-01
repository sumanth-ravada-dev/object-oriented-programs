package com.java.oop.inheritance;

public class PremiumCustomer extends Customer {
    char membership;
    int cashback;
    String gift;

    public PremiumCustomer(){
        System.out.println("Premium Customer Constructor is called");
    }
    public PremiumCustomer(int id,String name,long phNo,String email,float discPer,char membership,int cashback,String gift){
        super(id,name,phNo,email,discPer);//Call to (Super Class)Customer Class Constructor
        this.membership=membership;
        this.cashback=cashback;
        this.gift=gift;

    }
    void displayPremiumCustomerDetails(){
        displayCustomerDetails();
        System.out.println("Membership : "+membership);
        System.out.println("Cashback Worth : "+cashback);
        System.out.println("Gift recieved : "+gift);
    }
}
