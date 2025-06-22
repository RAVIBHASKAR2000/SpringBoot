package com.example.SimpleWebApplicationDevUsingJPA.repository;


import com.example.SimpleWebApplicationDevUsingJPA.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
