package com.java.oop.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public List<Customer> getCustomersFromCsv() throws IOException {
        //CSV file path
        File file=new File("C://Users//HP//Downloads//customers.csv");
        BufferedReader br=new BufferedReader(new FileReader(file));
        //System.out.println(br.readLine());
        br.readLine();
        String custData=br.readLine();
        List<Customer> customers=new ArrayList<>();
        while(custData!=null){
            //System.out.println(productData);
            String[] data=custData.split(",");
            Customer customer=new Customer();
            customer.setId(Integer.parseInt(data[0]));
            customer.setName(data[1]);
            customer.setEmail(data[2]);
            customer.setPassword(data[3]);
            customer.setPhoneNum(data[4]);
            customer.setAge(Integer.parseInt(data[5]));
            customer.setGender(data[6]);
            customer.setStatus(data[7]);
            customer.setMembership(data[8]);
            customers.add(customer);
            custData=br.readLine();


        }
        return customers;
    }
    public List<Product> getProductsFromCsv() throws IOException {
        File file=new File("C://Users//HP//Downloads//products.csv");
        BufferedReader br=new BufferedReader(new FileReader(file));
        br.readLine();
        String productData=br.readLine();
        List<Product> products=new ArrayList<>();
        while(productData!=null){
            String[] data=productData.split(",");
            Product product=new Product();
            product.setId(Integer.parseInt(data[0]));
            product.setName(data[1]);
            product.setMaxRetailPrice(Integer.parseInt(data[2]));
            product.setDiscountPercentage(Byte.parseByte(data[3]));
            product.setAvailable(Boolean.parseBoolean(data[4]));
            product.setCompany(data[5]);
            product.setCategory(data[6]);
            product.setManufacturedYear(Integer.parseInt(data[7]));
            products.add(product);
            productData=br.readLine();

        }
        return products;

    }
}
