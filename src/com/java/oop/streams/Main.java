package com.java.oop.streams;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
//        CsvReader csvReader=new CsvReader();
//        List<Customer> customers=csvReader.getCustomersFromCsv();
//        for (Customer customer :customers){
//            System.out.println(customer);
//
//        }
//        List<Product> products =csvReader.getProductsFromCsv();
//        for(Product product:products){
//            System.out.println(product);
//        }
        ProductService productService=new ProductService();
        Optional<Product> product=productService.getProductById(100);
        if(product.isEmpty()){
            System.out.println("No Product Found");
        }
        else{
            System.out.println(product.get().getName());
        }
    }
}
