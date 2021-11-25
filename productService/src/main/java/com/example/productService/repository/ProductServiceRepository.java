package com.example.productService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productService.model.Products;

@Repository
public interface ProductServiceRepository extends JpaRepository<Products, Long> {

}
