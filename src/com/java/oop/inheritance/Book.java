package com.java.oop.inheritance;

public class Book extends Product{
    String author;
    int pages;
    String publisher;

    public Book(){
        System.out.println("Book Constructor is called");
    }
    public Book(int id,String name,int maxRetailPrice,float discountPercentage,float rating,boolean isAvailable,String author,int pages,String publisher){
        super(id, name, maxRetailPrice, discountPercentage, rating, isAvailable);
        this.author=author;
        this.pages=pages;
        this.publisher=publisher;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Book Author : "+author);
        System.out.println("Book pages : "+pages);
        System.out.println("Book Publisher : "+publisher);
    }

}
