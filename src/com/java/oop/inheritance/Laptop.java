package com.java.oop.inheritance;

public class Laptop extends Product{
    int hardDiskSize;
    int ram;
    String operatingSystem;

    public Laptop(){
        super();//super constructor call(Product Constructor)
        System.out.println("Laptop Constructor called");
    }
    public Laptop(int id,String name,int maxRetailPrice,float discountPercentage,float rating,boolean isAvailable,int hardDiskSize,int ram,String operatingSystem){
        super(id, name, maxRetailPrice, discountPercentage, rating, isAvailable);
        this.hardDiskSize=hardDiskSize;
        this.ram=ram;
        this.operatingSystem=operatingSystem;

    }
    public void displayLaptopDetails(){
        displayProductDetails();
        System.out.println("Hard Disk Size : "+hardDiskSize);
        System.out.println("Ram : "+ram);
        System.out.println("Operating System : "+operatingSystem);
    }
}
