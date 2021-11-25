package com.example.productService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productService.model.Products;
import com.example.productService.service.ProductServices;

@RestController
@RequestMapping("/products")
public class ProductServiceController {
	
	@Autowired
	private ProductServices productService;
	
	
	@GetMapping("/all")
	public List<Products> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@PostMapping("/product")
	public Products saveProduct(@RequestBody Products product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping("product/{id}")
	public Products getByProductId(@PathVariable("id") Long id) {
		return productService.getByProductId(id);
	}
	
	@GetMapping("prod/{productCode}")
	public Products getByProductCode(@PathVariable("productCode") Long productCode) {
		return productService.getByid(productCode);
	}
	
	

}
