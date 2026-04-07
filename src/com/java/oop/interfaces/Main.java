package com.java.oop.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Option ");
        System.out.println("1. Cash");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        System.out.println("4. UPI Payment");
        int choice=scanner.nextInt();
        OrderService orderService;
        double amount;
        Payment payment;
        int otp;
        switch (choice){
            case 1:
                payment=new CashOnDeliveryPayment();
                orderService=new OrderService(payment);
                System.out.println("Enter the amount");
                amount=scanner.nextDouble();
                if(orderService.processOrder(amount)){
                    System.out.println("Order processed successfully using Cash");
                }
                break;
            case 2:
                payment=new CreditCardPayment();
                orderService=new OrderService(payment);
                System.out.println("Enter the amount");
                amount=scanner.nextDouble();
                if(orderService.processOrder(amount)){
                    System.out.println("Order processed successfully using Credit Card");
                }
                break;
            case 3:
                payment=new DebitCardPayment();
                orderService=new OrderService(payment);
                System.out.println("Enter the amount");
                amount=scanner.nextDouble();
                if(orderService.processOrder(amount)){
                    System.out.println("Order processed successfully using Debit Card");
                }
                break;
            case 4:
                payment=new UpiPayment();
                orderService=new OrderService(payment);
                System.out.println("Enter the amount");
                amount=scanner.nextDouble();
                if(orderService.processOrder(amount)){
                    System.out.println("Order processed successfully using UPI payment");
                }
                break;
            default:
                System.out.println("Invalid Option");

        }
    }
}
