package com.java.oop.functional;

import com.java.oop.functional.Greeting;

public class Main {
    public static void main(String[] args) {
//        Greeting greeting=new Greeting() {
//            @Override
//            public void greet() {
//                System.out.println("Hello,How are you !");
//            }
//        };
        Greeting greeting = (String name,String msg)-> System.out.println(name+","+msg);
        greeting.greet("Sumanth","Hello How are you !");

    }
}
