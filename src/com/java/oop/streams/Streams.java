package com.java.oop.streams;

import com.java.oop.encapsulation.p1.C;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) throws IOException {
        CsvReader csvReader=new CsvReader();
        List<Customer> customers=csvReader.getCustomersFromCsv();
        List<Product> products=csvReader.getProductsFromCsv();

        //intermediate operation
        /*
        filter
        list of products within range 10000,100000

         */

//        List<Product> filteredProducts=new ArrayList<>();
//        for (Product product:filteredProducts){
//            if(product.getMaxRetailPrice()>=10000 && product.getMaxRetailPrice()<=100000){
//                filteredProducts.add(product);
//            }
//        }
        List<Customer> filteredCustomers=new ArrayList<>();
        for(Customer customer:customers){
            if(customer.getAge()>30 && customer.getAge()<45){
                filteredCustomers.add(customer);
            }
        }
        for (Customer customer:filteredCustomers){
            System.out.println(customer);
        }
        System.out.println("------------------------");
        System.out.println("Using Streams : ");
        List<Customer> filteredCustomers1=customers.stream().filter(customer -> customer.getAge()>30 && customer.getAge()<45)
                .toList();
        for (Customer customer:filteredCustomers1){
            System.out.println(customer);
        }

        List<String> productNames;
        productNames=products.stream().map(Product::getName).toList();
        System.out.println(productNames);

        //non-duplicates
        List<Product> nonDuplicateProducts=products.stream().distinct().toList();
        System.out.println(nonDuplicateProducts.size());

        List<Product> sortedProductsBasedOnPrice=products.stream().sorted((p1,p2)->Double.compare(p1.getMaxRetailPrice(),p2.getMaxRetailPrice())).toList();
        //sorted based on price
        System.out.println(sortedProductsBasedOnPrice);

        //sorted based on name
        List<Product> sortedProductBasedOnName=products.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).toList();
        System.out.println(sortedProductBasedOnName);

        //top5HighestRatedProducts
        List<Product> top5HighestPriceProducts=products.stream().sorted((p1,p2)->Double.compare(p2.getMaxRetailPrice(),p1.getMaxRetailPrice())).limit(5).toList();
        System.out.println(top5HighestPriceProducts);

        products.forEach(System.out::println);

        //grouping based on companies
        Map<String,List<Product>> productsByCompany=products.stream().collect(Collectors.groupingBy(Product::getCompany));
        System.out.println("------------------Products By Company--------------");
        System.out.println(productsByCompany);

        Map<String,Long> productsCountByCategory =products.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));
        System.out.println("------------Products Count by Category------------");
        System.out.println(productsCountByCategory);

        products.stream().
                collect(Collectors.groupingBy(Product::getCompany,Collectors.counting())).
                forEach((String company,Long count)->System.out.println(company+" : "+count));

        //company total inventory
        long totalInventoryValue=products.stream().collect(Collectors.summingLong(Product::getMaxRetailPrice));
        System.out.println("Total Inventory Value: "+totalInventoryValue);

        long totalInventoryValue1=products.stream().mapToLong(Product::getMaxRetailPrice).sum();
        System.out.println("Total Inventory Value: "+totalInventoryValue1);

        double averagePrice=products.stream().mapToDouble(Product::getMaxRetailPrice).average().orElse(0);
        System.out.println("Average Price : "+averagePrice);

        Map<Boolean,List<Product>> productsBasedOnAvailability=products.stream().collect(Collectors.partitioningBy(Product::isAvailable));
        System.out.println(productsBasedOnAvailability);

        List<Product> productsGreaterThan80000=products.stream().filter(product -> product.getMaxRetailPrice()>80000).toList();
        System.out.println(productsGreaterThan80000);

        long availableProductsCount=products.stream().filter(product -> product.isAvailable==true).count();
        System.out.println(availableProductsCount);

        boolean isParticularCompanyProductsAvailable= products.stream().anyMatch(product -> product.getCompany().equals("Apple"));
        System.out.println(isParticularCompanyProductsAvailable);

        boolean isAllProductsAvailable=products.stream().allMatch(Product::isAvailable);
        System.out.println(isAllProductsAvailable);


    }
}
