package com.java.oop.inheritance;

public class Service {
    void validate(Product product){
        System.out.println("Validating product");
    }
    void validate(Laptop laptop){
        System.out.println("Validating Laptop");
    }
    void validate(WindowsLaptop windowsLaptop){
        System.out.println("Validating Windows Laptop");
    }
}
