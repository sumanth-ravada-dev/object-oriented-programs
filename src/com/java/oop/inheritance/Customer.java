package com.java.oop.inheritance;

public class Customer {
    int id;
    String name;
    long phNo;
    String email;
    float discPer;

    public Customer(){
        System.out.println("Customer Constructor is called");
    }
    public Customer(int id,String name,long phNo,String email,float discPer){
        this.id=id;
        this.name=name;
        this.phNo=phNo;
        this.email=email;
        this.discPer=discPer;
    }
    void displayCustomerDetails(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Phone Number : "+phNo);
        System.out.println("EmailId : "+email);
        System.out.println("Discount Percentage : "+discPer);
    }

}
