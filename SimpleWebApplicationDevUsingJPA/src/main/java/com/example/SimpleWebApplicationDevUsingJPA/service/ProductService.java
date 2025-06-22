package com.example.SimpleWebApplicationDevUsingJPA.service;

import com.example.SimpleWebApplicationDevUsingJPA.model.Product;
import com.example.SimpleWebApplicationDevUsingJPA.repository.ProductRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product>  products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 60000) ,
//            new Product(123, "Samsung", 50000),
//            new Product(124, "BlackBerry", 30000)
//
//    ));
    public List<Product>  getProducts(){
        return repo.findAll();
    }


    public  Product getProductById(int prodId){
//        return products.stream().filter(p -> p.getProdID() == prodId ).findFirst().get();
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
//        products.add(prod);
        repo.save(prod);
    }

    public void  updateProduct(Product prod){

//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdID() == prod.getProdID()){
//                products.set(i, prod);
//                break;
//            }
//        }

        repo.save(prod);
    }

    public ResponseEntity<? extends Object> deleteProduct(int prodID){
//        int index =-1;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdID() == prodID){
//                index =i;
//                break;
//            }
//        }
//        if(index !=-1) {
//            products.remove(index);
//            return ResponseEntity.status(HttpStatus.OK).build();
//        }
//        else{
//            return ResponseEntity.status(HttpStatus.NOT_FOUND)
//                    .body("Product with ID " + prodID + " not found");
//        }

        try {
            // Attempt to delete by ID
            repo.deleteById(prodID);
            return ResponseEntity.status(HttpStatus.OK).build();  // HTTP 200 OK
        } catch (EntityNotFoundException e) {
            // If the product is not found, return HTTP 404 Not Found
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Product with ID " + prodID + " not found");
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while trying to delete the product");
        }


    }


}
