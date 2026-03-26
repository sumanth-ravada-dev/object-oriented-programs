package com.java.oop.arrays;

import java.util.Arrays;

public class CustomerArrays {
    public static void main(String[] args) {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer(1, "customer1", "0123456789", "customer1@gmail.com", (byte) 20, 'M');
        customers[1] = new Customer(2, "customer2", "0123456788", "customer2@gmail.com", (byte) 21, 'F');
        customers[2] = new Customer(3, "customer3", "0123456787", "customer3@gmail.com", (byte) 29, 'M');
        customers[3] = new Customer(4, "customer4", "0123456786", "customer4@gmail.com", (byte) 23, 'F');
        customers[4] = new Customer(5, "customer5", "0123456785", "customer5@gmail.com", (byte) 24, 'M');

        for (Customer customer : customers) {
            customer.displayCustomerDetails();
        }
        //sort all customers by name
        //find the customer with highest age
        Customer highestAgeCustomer = customers[0];
        for (Customer customer : customers) {
            if (customer.age > highestAgeCustomer.age) {
                highestAgeCustomer = customer;
            }
        }
        highestAgeCustomer.displayCustomerDetails();
//        int maleCount=0;
//        for(Customer customer : customers){
//            if(customer.gender=='M'){
//                maleCount++;
//            }
//        }
//        System.out.println("Male Count : "+maleCount);

        System.out.println(CustomerArrays.getMaleCustomerCount(customers));
        System.out.println(CustomerArrays.highestAgedCustomer(customers).age);
        System.out.println(CustomerArrays.customerWithAgeGreaterThan(customers,20));
        System.out.println(CustomerArrays.customerWithAgeBetween(customers,22,29));
    }


         public static int getMaleCustomerCount(Customer[] customers){
            int maleCount=0;
            for(Customer customer : customers){
                if(customer.gender=='M'){
                    maleCount++;
                }
            }
            return maleCount;
        }

        public static Customer getCustomerById(Customer[] customers,int id ){

            for(Customer customer : customers)
            {
                if(customer.id==id){
                    return customer;
                }
            }
            return null;
        }
        public static Customer highestAgedCustomer(Customer[] customers){
           Customer  highestAgedCust=customers[0];
           for(Customer customer :customers){
               if(customer.age>highestAgedCust.age){
                   highestAgedCust=customer;
               }
           }
           return highestAgedCust;
        }
        public static Customer[] sortCustomersByName(Customer[] customers){

            return null;
        }
        public static int customerWithAgeGreaterThan(Customer[] customers,int age ){
            int count=0;
            for(Customer customer : customers){
                if(customer.age>age){
                    count++;
                }
            }
            return count;
        }
        public static int customerWithAgeBetween(Customer[] customers,int minAge,int maxAge ){
            int count=0;
            for(Customer customer : customers){
                if((customer.age>=minAge) && (customer.age<=maxAge)){
                    count++;
                }
            }
            return count;
        }







    }

