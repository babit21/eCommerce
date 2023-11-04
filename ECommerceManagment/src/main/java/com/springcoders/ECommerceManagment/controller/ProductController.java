package com.springcoders.ECommerceManagment.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcoders.ECommerceManagment.entity.Product;
import com.springcoders.ECommerceManagment.service.ProductService;


@RestController

public class ProductController {
	
	@Autowired
	
	ProductService services;
	
	@PostMapping("/save")
	public Product createProduct(@RequestBody Product product) {
		return services.createProduct(product);
	}
		
		@GetMapping("/findById/{id}")
		private Product getProductById(@PathVariable Long id) {
			return services.getProductById(id);
			
		}
		
		@GetMapping("/productFindAll")
		
		private List<Product> findAllProduct(){
			return services.getAllProduct();
			
		
		}
		
		@DeleteMapping("/product/{id}")
		 private String deleteProduct(@PathVariable Long id) {
			services.deleteProduct(id);
			return "delete successfully";
			
		} 
		
		@PutMapping("/productupdate/{id}")
		private Product updateProduct(@RequestBody Product product,@PathVariable Long id) {
			return services.updateProduct(product,id);
			
		}
	
	}






