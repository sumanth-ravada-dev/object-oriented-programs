package com.java.oop.exceptions;

import com.java.oop.streams.CsvReader;
import com.java.oop.streams.Product;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class ProductService {

    List<com.java.oop.streams.Product> products;
    ProductService() throws IOException {
        products=new CsvReader().getProductsFromCsv();
    }

    public Optional<com.java.oop.streams.Product> getProductById(int id){
        return products.stream().filter(p->p.getId()==id).findFirst();
    }

    public List<Product> getAllProducts(){
        return products;
    }
    public Product addProduct(com.java.oop.streams.Product product) throws ProductExistsException {
       Optional<com.java.oop.streams.Product> productById=getProductById(product.getId());
       if(productById.isPresent()){
           throw new ProductExistsException("Product already exits with id :"+product.getId());
       }
       else {
           products.add(product);
       }
        return product;
    }
}
