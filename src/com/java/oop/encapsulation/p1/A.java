package com.java.oop.encapsulation.p1;

public class A {
    protected int value=50;
    protected A(){
        System.out.println("A() constructor called ");
    }
    public void m1(){
        System.out.println("m1() is called");
    }
    public static void main(String[] args) {
        A a;
        a=new A();
        System.out.println(a.value);
    }
}
