package com.example.SimpleWebApplicationDev.service;

import com.example.SimpleWebApplicationDev.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {


    List<Product>  products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 60000) ,
            new Product(123, "Samsung", 50000),
            new Product(124, "BlackBerry", 30000)

    ));
    public List<Product>  getProducts(){
        return products;
    }


    public  Product getProductById(int prodId){
        return products.stream().filter(p -> p.getProdID() == prodId ).findFirst().get();
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void  updateProduct(Product prod){

        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdID() == prod.getProdID()){
                products.set(i, prod);
                break;
            }
        }
    }

    public ResponseEntity<? extends Object> deleteProduct(int prodID){
        int index =-1;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdID() == prodID){
                index =i;
                break;
            }
        }
        if(index !=-1) {
            products.remove(index);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Product with ID " + prodID + " not found");
        }

    }


}
