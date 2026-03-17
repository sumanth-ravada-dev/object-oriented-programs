package com.java.oop;

public class OrderMain {
    public static void main(String[] args) {
        Order order;
        order = new Order();

        order.printOrderDetails();

//        System.out.println("Order id "+order.id);
//        System.out.println("Order Name "+order.orderName);
//        System.out.println("Order Total Price "+order.totalPrice);
//        System.out.println("Orders sold "+order.ordersSold);
//        System.out.println("Order is Available  "+order.isAvailable);

        Order order1=new Order(2,"Trowser",500.0F,978452,true);
        order1.printOrderDetails();
//        System.out.println("Order id "+order1.id);
//        System.out.println("Order Name "+order1.orderName);
//        System.out.println("Order Total Price "+order1.totalPrice);
//        System.out.println("Orders sold "+order1.ordersSold);
//        System.out.println("Order is Available  "+order1.isAvailable);

        Order order2=new Order(3,"Mobile",80564.68F,695651,false);
        order2.printOrderDetails();
//        System.out.println("Order id "+order2.id);
//        System.out.println("Order Name "+order2.orderName);
//        System.out.println("Order Total Price "+order2.totalPrice);
//        System.out.println("Orders sold "+order2.ordersSold);
//        System.out.println("Order is Available  "+order2.isAvailable);

        Order order3=new Order(4,"SmartWatch",2540.0F,9452,false);
        order3.printOrderDetails();
//        System.out.println("Order id "+order3.id);
//        System.out.println("Order Name "+order3.orderName);
//        System.out.println("Order Total Price "+order3.totalPrice);
//        System.out.println("Orders sold "+order3.ordersSold);
//        System.out.println("Order is Available  "+order3.isAvailable);

        Order order4=new Order(5,"Laptop",250000.88F,84611452,false);
        order4.printOrderDetails();
//        System.out.println("Order id "+order4.id);
//        System.out.println("Order Name "+order4.orderName);
//        System.out.println("Order Total Price "+order4.totalPrice);
//        System.out.println("Orders sold "+order4.ordersSold);
//        System.out.println("Order is Available  "+order4.isAvailable);

        Order order5=new Order(6,"SonySmartTv",159550.99F,1110452,true);
        order5.printOrderDetails();
//        System.out.println("Order id "+order5.id);
//        System.out.println("Order Name "+order5.orderName);
//        System.out.println("Order Total Price "+order5.totalPrice);
//        System.out.println("Orders sold "+order5.ordersSold);
//        System.out.println("Order is Available  "+order5.isAvailable);

        Order.orderPaymentDetails();

    }
}
