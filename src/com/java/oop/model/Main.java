package com.java.oop.model;

public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setId(1111)
        .setName("customer1")
        .setEmail("customer1@gmail.com")
        .setPhoneNo("+91-9784545454")
        .setAddress("Hyderabad");

        System.out.println("Id : "+customer.getId());
        System.out.println("Name : "+customer.getName());
        System.out.println("Email : "+customer.getEmail());
        System.out.println("Phone Number : "+customer.getPhoneNo());
        System.out.println("Address : "+customer.getAddress());

        System.out.println(customer);
//         classtype@hashcode
//        com.java.oop.model.Customer@34a245ab
    }
}
