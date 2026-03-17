package com.java.oop;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer;
        customer =new Customer();
        customer.displayCustomerDetails();

//        System.out.println("Customer id : "+customer.id);
//        System.out.println("Customer name : "+customer.name);
//        System.out.println("Customer phone number : "+customer.phNo);
//        System.out.println("Customer email : "+customer.email);
//        System.out.println("Customer membership : "+customer.membership);
//        System.out.println("Customer discount percentage : "+customer.discPer);

        Customer customer1=new Customer(2,"Uthamesh",7894561823L,"uthamesh155@gmail.com",'D',10.50F);
        customer1.displayCustomerDetails();

//        System.out.println("Customer id : "+customer1.id);
//        System.out.println("Customer name : "+customer1.name);
//        System.out.println("Customer phone number : "+customer1.phNo);
//        System.out.println("Customer email : "+customer1.email);
//        System.out.println("Customer membership : "+customer1.membership);
//        System.out.println("Customer discount percentage : "+customer1.discPer);

        Customer customer2=new Customer(3,"Sangamesh",8529637412L,"sangamesh45@gmail.com",'S',5.50F);
        customer2.displayCustomerDetails();

//        System.out.println("Customer id : "+customer2.id);
//        System.out.println("Customer name : "+customer2.name);
//        System.out.println("Customer phone number : "+customer2.phNo);
//        System.out.println("Customer email : "+customer2.email);
//        System.out.println("Customer membership : "+customer2.membership);
//        System.out.println("Customer discount percentage : "+customer2.discPer);

        Customer customer3=new Customer(4,"Mahesh",9525638912L,"mahesh05@gmail.com",'G',15.50F);
        customer3.displayCustomerDetails();

//        System.out.println("Customer id : "+customer2.id);
//        System.out.println("Customer name : "+customer2.name);
//        System.out.println("Customer phone number : "+customer2.phNo);
//        System.out.println("Customer email : "+customer2.email);
//        System.out.println("Customer membership : "+customer2.membership);
//        System.out.println("Customer discount percentage : "+customer2.discPer);

        Customer customer4=new Customer(5,"Santosh",7448538912L,"santosh18@gmail.com",'S',5.50F);
        customer4.displayCustomerDetails();

//        System.out.println("Customer id : "+customer2.id);
//        System.out.println("Customer name : "+customer2.name);
//        System.out.println("Customer phone number : "+customer2.phNo);
//        System.out.println("Customer email : "+customer2.email);
//        System.out.println("Customer membership : "+customer2.membership);
//        System.out.println("Customer discount percentage : "+customer2.discPer);

        Customer customer5=new Customer(6,"Subash",9525638777L,"subash25@gmail.com",'D',10.50F);
        customer5.displayCustomerDetails();

//        System.out.println("Customer id : "+customer5.id);
//        System.out.println("Customer name : "+customer5.name);
//        System.out.println("Customer phone number : "+customer5.phNo);
//        System.out.println("Customer email : "+customer5.email);
//        System.out.println("Customer membership : "+customer5.membership);
//        System.out.println("Customer discount percentage : "+customer5.discPer);

        Customer.printCustomerAddress();




    }
}
