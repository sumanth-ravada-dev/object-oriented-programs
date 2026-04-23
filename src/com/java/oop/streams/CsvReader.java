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
        String productData=br.readLine();
        List<Customer> customers=new ArrayList<>();
        while(productData!=null){
            //System.out.println(productData);
            String[] data =productData.split(",");
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
            productData=br.readLine();


        }
        return customers;
    }
}
