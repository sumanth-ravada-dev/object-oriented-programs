package com.java.oop.collection;

import com.java.oop.model.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
         List<Customer> customers=new LinkedList<>();
        Customer customer1=new Customer();
        customer1.setId(1111)
                .setName("Rahul")
                .setEmail("rahul@gmail.com")
                .setPhoneNo("+91-9874561235")
                .setAddress("Hyderabad");
        Customer customer2=new Customer();
        customer2.setId(4444)
                .setName("kumar")
                .setEmail("kumar@gmail.com")
                .setPhoneNo("+91-9874578235")
                .setAddress("Visakhapatnam");
        Customer customer3=new Customer();
        customer3.setId(3333)
                .setName("jagadeesh")
                .setEmail("jagadeesh@gmail.com")
                .setPhoneNo("+91-9784578235")
                .setAddress("Chennnai");
        Customer customer4=new Customer();
        customer4.setId(2222)
                .setName("sumanth")
                .setEmail("sumanth@gmail.com")
                .setPhoneNo("+91-9874578235")
                .setAddress("Visakhapatnam");
        Customer customer5=new Customer();
        customer1.setId(1111)
                .setName("Rahul")
                .setEmail("rahul@gmail.com")
                .setPhoneNo("+91-9874561235")
                .setAddress("Hyderabad");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        System.out.println(customers);
        System.out.println(customers.size());
        System.out.println(customers.get(0));

        //return customer emails list
        List<String> emails=new ArrayList<>();
        for(Customer customer : customers){
            emails.add(customer.getEmail());
        }
        System.out.println(emails);



    }
}
