package com.java.oop;

import java.util.List;

public class Product {


    //state
    //id,name,maxRetailPrice,discountPercentage,rating,isAvailable
    //instance(object) variables
    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    float rating;
    boolean isAvailable;

    final static String COMPANY_NAME="Amazon";//It is suggested to give Capital Letters to final variables
    final static String COMPANY_EMAIL="amazon345@gmail.com";
    final static long COMPANY_PHNO=7845961236L;
    //constructor
    public Product(){
        System.out.println("Product() is called");
        id=1;
        name="Samsung galaxy S20";
        maxRetailPrice =120000;
        discountPercentage=10.5F;
        rating=4.5F;
        isAvailable=true;
    }

    //method declaration
    void displayProductDetails()
    {
        System.out.println("-------------------------");
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("MRP: "+maxRetailPrice);
        System.out.println("Discount: "+discountPercentage);
        System.out.println("Rating: "+rating);
        System.out.println("Available: "+isAvailable);

    }

    static void displayCompanyDetails(){
        System.out.println("Company Name : "+COMPANY_NAME);
        System.out.println("Company email : "+COMPANY_EMAIL);
        System.out.println("Company phNo : "+COMPANY_PHNO);
    }

    public Product(int id,String name,int maxRetailPrice,float discountPercentage,float rating,boolean isAvailable) {
        this.id=id;
        this.name=name;
        this.maxRetailPrice=maxRetailPrice;
        this.discountPercentage=discountPercentage;
        this.rating=rating;
        this.isAvailable=isAvailable;

    }

    //with arguments without returntype

    void displayProductByCompanyNameAndManufacturedYear(String companyName,int manufacturedYear) {

        System.out.println("Products by Company: "+ companyName);
        System.out.println("Products manufactured in year : "+ manufacturedYear);
    }

    int getTotalProductCount(){
        return 10;
    }

    long totalProductValue(){
        return 1055555111155L;
    }

    //highest Rated product
    Product getHighestRatedproduct(){
        return new Product();
    }

    //sort the products based on rating which should
    //return a list of products
    List<Product> sortProductBasedonRating() {
        return null;
    }

    List<Product> filterProductsBasedOnPriceRange(int minPrice,int maxPrice){
        return  null;
    }

}
