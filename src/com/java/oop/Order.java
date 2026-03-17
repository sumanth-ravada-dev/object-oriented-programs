package com.java.oop;

public class Order {

    int id;
    String orderName;
    float totalPrice;
    int ordersSold;
    boolean isAvailable;

    final static String E_COMMERCE_PLATFORM = "Flipkart";
    final static  String CURRENCY_USED="Rupee";
    final static String PAYMENT_PLATFORM="PhonepE";

    public Order(){

        System.out.println("Order() is called");
        id=1;
        orderName="T-Shirt";
        totalPrice=1895.5F;
        ordersSold=1508545;
        isAvailable=true;
    }

    public Order(int id,String orderName,float totalPrice,int ordersSold,boolean isAvailable)
    {
        this.id=id;
        this.orderName=orderName;
        this.totalPrice=totalPrice;
        this.ordersSold=ordersSold;
        this.isAvailable=isAvailable;
    }
    void printOrderDetails(){

        System.out.println("---------------");
        System.out.println("Order id "+id);
        System.out.println("Order Name "+orderName);
        System.out.println("Order Total Price "+totalPrice);
        System.out.println("Orders sold "+ordersSold);
        System.out.println("Order is Available  "+isAvailable);
    }

    static void orderPaymentDetails(){
        System.out.println("E-Commerce platform of Order :"+E_COMMERCE_PLATFORM);
        System.out.println("Currency Used for transaction :"+CURRENCY_USED);
        System.out.println("Online Payment platform of Order :"+PAYMENT_PLATFORM);
    }
}
