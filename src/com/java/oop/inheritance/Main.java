package com.java.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        //System.out.println("Id : "+product.id);
         Product product2=new Product(2,"Iphone 13",145000,10.54f,4.8f,true);
         //product2.displayProductDetails();

         Laptop laptop=new Laptop();
//         System.out.println(laptop.hardDiskSize);
//         System.out.println(laptop.ram);
//         System.out.println(laptop.operatingSystem);
         Laptop laptop2=new Laptop(3,"Acer",84622,2.03f,4.5f,true,60,128,"Mac");
         laptop2.displayDetails();

         Book book=new Book(4,"Book2",445,2.4f,3.9f,true,"Dinesh",100,"Aditya Publishers");
        // book.displayBookDetails();

         WindowsLaptop windowsLaptop=new WindowsLaptop();

         Service service=new Service();
         service.validate(product);
         service.validate(laptop);
         service.validate(windowsLaptop);

         PremiumCustomer pc=new PremiumCustomer();

         PremiumCustomer premiumCustomer=new PremiumCustomer(32,"Sathish",7454447894L,"sathi12@gmil.com",12.45f,'D',1500,"T-Shirt");
         premiumCustomer.displayPremiumCustomerDetails();

         windowsLaptop.displayDetails("Samsung");
         windowsLaptop.displayDetails("Samsung",2020);
         windowsLaptop.displayDetails("Samsung",2025,true);

         service.displayDetails(product);
         service.displayDetails(product2);
         service.displayDetails(book);
         service.displayDetails(laptop2);


    }
}
