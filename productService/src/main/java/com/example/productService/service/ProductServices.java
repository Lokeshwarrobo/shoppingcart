package com.example.productService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.productService.model.Products;
import com.example.productService.repository.ProductServiceRepository;

@Service
public class ProductServices {
	
	@Autowired
	private ProductServiceRepository productServiceRepository;

	public List<Products> getAllProducts() {
		return productServiceRepository.findAll();
	}
	
	public Products saveProduct(Products product) {
		return productServiceRepository.save(product);
	}

	public Products getByProductId(Long id) {
		return productServiceRepository.findById(id).get();
	}

	public Products getByProductCode(Long productCode) {
		return productServiceRepository.findById(productCode).get();
	}
	
	   // Method  to get empid
    public Products getByCode(Long productCode) {
       try {
    	   Products getdetails =
                   (Products) productServiceRepository
                           .findAll()
                           .stream()
                           .filter
                                   (t -> productCode.equals(t.getProductCode() ))
                           .findFirst()
                           .orElse(null);

           return getdetails;
       }
       catch (RuntimeException runtimeException){
           throw new RuntimeException("There Was a problem while Getting Data");
       }
    }
	
 // API to get  details by empid
    
    public Products getByid(Long ProductCode) {
        try {
            return getByCode(ProductCode);
        }
        catch (RuntimeException runtimeException){
            throw new RuntimeException("There Was a problem while Getting Data");
        }
    }

}
