package com.java.oop.arrays;

public class Customer {

    int id;
    String name;
    String phNo;
    String email;
    byte age;
    char gender;

     Customer(int id, String name, String phNo, String email, byte age,char gender){
         this.id=id;
         this.name=name;
         this.phNo=phNo;
         this.email=email;
         this.age=age;
         this.gender=gender;

     }

    void displayCustomerDetails(){
        System.out.println("-----------------------");
        System.out.println("Customer id : "+id);
        System.out.println("Customer name : "+name);
        System.out.println("Customer phone number : "+phNo);
        System.out.println("Customer email : "+email);
        System.out.println("Customer age : "+age);
        System.out.println("Customer gender : "+gender);
    }
}
