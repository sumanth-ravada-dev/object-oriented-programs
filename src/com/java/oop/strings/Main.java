package com.java.oop.strings;

import com.java.oop.Customer;

public class Main {
    static String name;
    public static void main(String[] args) {
//        String str1=new String();
//        System.out.println(str1);
        String name=null;//local variable (stack)
        System.out.println(name);
        char[] chars={'a','b','c','d'};
        String str2=new String(chars);
        System.out.println(str2);
        String str3=new String("abcd");
        String str4=new String("abcd");
        System.out.println(str3==str4);
        //string literals
        String str5="abcd";
        String str6="abcd";
        System.out.println(str5==str6);
        //String manipulation
        System.out.println(str5.charAt(2));
        String username="admin123";
        String password="admin@123";
        System.out.println(username.compareToIgnoreCase("ADMIN123"));
        String greeting="Hello ";
        greeting.concat(username);//Hello admin123
        greeting=greeting.concat(username);
        System.out.println(greeting);
        /*
        String Objects are immtable Objects
         */
        if(username.equalsIgnoreCase("AdMIN123")&&password.equalsIgnoreCase("ADMin@123")){
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Invalid Credentials");
        }
        if(username.length()>5&&username.length()<10){
            System.out.println("Username length is valid");
        }
        else {
            System.out.println("Username length is invalid");
        }
        //Regular expression
        //username validation alphanumeric with_
        String regex = "^[a-zA-Z0-9_]+$";
        if(username.matches(regex)){
            System.out.println("Username is Valid");
        }
        else{
            System.out.println("Username is invalid");
        }

        String customerData="101,john,1234567890,john@example.com,25,M";
        String[] split=customerData.split(",");

        //Customer customer=new Customer(Integer.parseInt(split[0]),split[1],(split[2]),split[3],Byte.parseByte(split[4]),(split[5]));
        //System.out.println("Id "+customer.id);

        String email="      sumanth12@gmail.com        ";
        if(email.trim().equals("sumanth12@gmail.com")){
            System.out.println("Email is Valid");
        }
        else {
            System.out.println("Email is Invalid");
        }





    }
}
