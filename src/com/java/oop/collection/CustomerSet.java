package com.java.oop.collection;

import com.java.oop.comparator.customerIdAscComparator;
import com.java.oop.model.Customer;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomerSet {
    public static void main(String[] args) {
        Set<Customer> customers=new TreeSet<>(new customerIdAscComparator());

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
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        System.out.println(customers);
        System.out.println(customers.size());

    }
}
