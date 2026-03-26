package com.java.oop;

import java.util.List;

public class Customer {

    int id;
    String name;
    long phNo;
    String email;
    char membership;
    float discPer;

    final static String LOCATION="Visakhapatnam,Vadlapudi";
    final static int PINCODE=530046;
    final static String NATIONALITY="INDIAN";

    public Customer()
    {
        System.out.println("Customer() is called");
        id=1;
        name="Sugnesh";
        phNo=9187845126L;
        email="sugnesh123@gmail.com";
        membership='G';
        discPer=15.50F;
    }
    public Customer(int id,String name,long phNo,String email,char membership,float discPer )
    {
        this.id=id;
        this.name=name;
        this.phNo=phNo;
        this.email=email;
        this.discPer=discPer;

    }
    void displayCustomerDetails(){
        System.out.println("-----------------------");
        System.out.println("Customer id : "+id);
        System.out.println("Customer name : "+name);
        System.out.println("Customer phone number : "+phNo);
        System.out.println("Customer email : "+email);
        System.out.println("Customer discount percentage : "+discPer);

    }

    static void printCustomerAddress(){
        System.out.println("Customer Location : "+LOCATION);
        System.out.println("Customer Pincode : "+PINCODE);
        System.out.println("Customer Nationality : "+NATIONALITY);
    }
}
