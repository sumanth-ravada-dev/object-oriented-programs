package com.java.oop;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //Product Object
        Product product;
        product=new Product();
        product.displayProductDetails();

        Product product1;//no object exists product is just a reference variable
        product1 =new Product(2,"Apple S6",150000,20.5F,4.9F,true);
        product1.displayProductDetails();


        //initialization
//        product.id=1;
//        product.name="Samsung Galaxy S20";
//        product.maxRetailPrice=120000;
//        product.discountPercentage=10.5F;
//        product.rating=4.5F;
//        product.isAvailable=true;

//        System.out.println("Id: "+product.id);
//        System.out.println("Name: "+product.name);
//        System.out.println("MRP: "+product.maxRetailPrice);
//        System.out.println("Discount: "+product.discountPercentage);
//        System.out.println("Rating: "+product.rating);
//        System.out.println("Available: "+product.isAvailable);

        Product product2=new Product(3,"One Plus nord 3",50000,5.05F,4.5F,false);
        product2.displayProductDetails();
//        product2.id=2;
//        product2.name="Samsung Galaxy A33";
//        product2.maxRetailPrice=100000;
//        product2.discountPercentage=16.5F;
//        product2.rating=4.8F;
//        product2.isAvailable=false;

//        System.out.println("Id: "+product2.id);
//        System.out.println("Name: "+product2.name);
//        System.out.println("MRP: "+product2.maxRetailPrice);
//        System.out.println("Discount: "+product2.discountPercentage);
//        System.out.println("Rating: "+product2.rating);
//        System.out.println("Available: "+product2.isAvailable);

        product.displayProductByCompanyNameAndManufacturedYear("Samsung",2024);
        int productCount=product.getTotalProductCount();
        System.out.println("Product Count : "+productCount);
        long totalProductsValue=product1.totalProductValue();
        System.out.println("Total value of products is : "+totalProductsValue);
        List<Product> productList=product.filterProductsBasedOnPriceRange(10000,100000);

        System.out.println("Company Name is : "+Product.COMPANY_NAME);
        System.out.println("Company Name is : "+product.COMPANY_NAME);
        // product.COMPANY_NAME="Samsung";company name can be changed if we don't use final keyword

        Product.displayCompanyDetails();



    }
}