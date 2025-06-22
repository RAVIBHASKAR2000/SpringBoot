package com.example.SimpleWebApplicationDev.controller;


import com.example.SimpleWebApplicationDev.model.Product;
import com.example.SimpleWebApplicationDev.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProduct(){

        return  service.getProducts();
    }

    @RequestMapping("/products/{prodID}")
    public Product getProductById(@PathVariable  int prodID){
        return service.getProductById(prodID);
    }


//    @RequestMapping("/products")
    @PostMapping("/products")
    public  void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public  void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodID}")
    public  ResponseEntity<? extends Object> deleteProductById(@PathVariable int prodID){
        return service.deleteProduct(prodID);
    }
}
