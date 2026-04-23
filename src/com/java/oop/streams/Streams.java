package com.java.oop.streams;

import com.java.oop.encapsulation.p1.C;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) throws IOException {
        CsvReader csvReader=new CsvReader();
        List<Customer> customers=csvReader.getCustomersFromCsv();

        //intermediate operation
        /*
        filter
        list of products within range 10000,100000

         */

//        List<Product> filteredProducts=new ArrayList<>();
//        for (Product product:filteredProducts){
//            if(product.getMaxRetailPrice()>=10000 && product.getMaxRetailPrice()<=100000){
//                filteredProducts.add(product);
//            }
//        }
        List<Customer> filteredCustomers=new ArrayList<>();
        for(Customer customer:customers){
            if(customer.getAge()>30 && customer.getAge()<45){
                filteredCustomers.add(customer);
            }
        }
        for (Customer customer:filteredCustomers){
            System.out.println(customer);
        }
        System.out.println("------------------------");
        System.out.println("Using Streams : ");
        List<Customer> filteredCustomers1=customers.stream().filter(customer -> customer.getAge()>30 && customer.getAge()<45)
                .toList();
        for (Customer customer:filteredCustomers1){
            System.out.println(customer);
        }




    }
}
