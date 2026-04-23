package com.java.oop.streams;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CsvReader csvReader=new CsvReader();
        List<Customer> customers=csvReader.getCustomersFromCsv();
        for (Customer customer :customers){
            System.out.println(customer);

        }
    }
}
