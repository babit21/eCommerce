package com.springcoders.ECommerceManagment.service;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.springcoders.ECommerceManagment.entity.Product;
import com.springcoders.ECommerceManagment.repository.ProductRepository;


	@Service
	public class ProductService {
		
	       @Autowired
	       
	       ProductRepository repository;
	       
	       public Product createProduct(Product product) {
			return repository.save(product) ;
	    	   
	       }

		public Product getProductById(Long id) {
			return repository.findById(id).get();
		}

		public List<Product> getAllProduct() {
			return repository.findAll() ;
		}

		public void deleteProduct(Long id) {
			repository.deleteById(id);
			
		}

		public Product updateProduct(Product product, Long id) {
			Product p = repository.findById(id).get();
			if(p.getProduct_name()!=null)
			{
				product.setProduct_name(product.getProduct_name());
			}
			if(p.getProduct_type()!=null)
			{
				p.setProduct_type(product.getProduct_type());
			}
				return repository.save(product);
		} 
	       

	   
	}


