package com.java.oop.collection;

import com.java.oop.Product;
import com.java.oop.comparator.customerIdAscComparator;
import com.java.oop.model.Customer;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Customer> customerMap=new TreeMap<>();

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
                .setAddress("Mumbai");
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
        customer5.setId(1111)
                .setName("jaswanth")
                .setEmail("jaswanth@gmail.com")
                .setPhoneNo("+91-9800578235")
                .setAddress("Bangok");

        customerMap.put(customer1.getId(),customer1);
        customerMap.put(customer2.getId(),customer2);
        customerMap.put(customer3.getId(),customer3);
        customerMap.put(customer4.getId(),customer4);
        customerMap.put(customer5.getId(),customer5);

        Set<Map.Entry<Integer,Customer>> entries =customerMap.entrySet();
        Iterator<Map.Entry<Integer,Customer>> iterator =entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Customer> entry=iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        Map<Customer,List<Product>> customerProductMap=new TreeMap<>(new customerIdAscComparator());

    }
//    public Map<String,List<Product>> getProductsByCategory(){
//        //1000 products(id,name,price,category)
//    }
}
