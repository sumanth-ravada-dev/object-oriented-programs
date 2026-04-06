package com.java.oop.abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        OrderService orderService=new OrderService();
//        if(orderService.processOrder(10000)){
//            System.out.println("Order Processed Successfully using cash");
//        }
//        if(orderService.processOrderCreditCard(20000)){
//            System.out.println("Order Processed successfully using credit card");
//        }
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
                payment=new CashOnDeliveryPayment("1","Sumanth","1-1-2026","Cash on Delivery");
                orderService=new OrderService(payment);
                System.out.println("Enter the amount");
                amount=scanner.nextDouble();
                System.out.println("Enter the otp");
                otp=scanner.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount)){
                    System.out.println("Order processed successfully using Cash");
                }
                break;
            case 2:
                payment=new CreditCardPayment("2","Jaswanth","2-4-2026","Credit Card");
                orderService=new OrderService(payment);
                System.out.println("Enter the amount");
                amount=scanner.nextDouble();
                System.out.println("Enter the otp");
                otp=scanner.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount)){
                    System.out.println("Order processed successfully using Credit Card");
                }
                break;
            case 3:
                payment=new DebitCardPayment("3","Hemanth","5-8-2026","Debit card");
                orderService=new OrderService(payment);
                System.out.println("Enter the amount");
                amount=scanner.nextDouble();
                System.out.println("Enter the otp");
                otp=scanner.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount)){
                    System.out.println("Order processed successfully using Debit Card");
                }
                break;
            case 4:
                payment=new UpiPayment("4","Prashanth","7-4-2026","UPI payment");
                orderService=new OrderService(payment);
                System.out.println("Enter the amount");
                amount=scanner.nextDouble();
                System.out.println("Enter the otp");
                otp=scanner.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount)){
                    System.out.println("Order processed successfully using UPI payment");
                }
                break;
            default:
                System.out.println("Invalid Option");

        }
    }
}


