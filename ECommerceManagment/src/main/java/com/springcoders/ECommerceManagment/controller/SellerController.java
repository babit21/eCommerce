package com.springcoders.ECommerceManagment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcoders.ECommerceManagment.entity.Seller;
import com.springcoders.ECommerceManagment.service.SellerService;


@RestController
@RequestMapping("/seller")


public class SellerController {
	
		
		@Autowired
		SellerService service;
		
		@PostMapping("/seller/save")
		private Seller saveSeller(@RequestBody Seller seller) {
			return service.addSeller(seller);
		}

		@GetMapping("/seller/findById/{id}")
		private Seller getSellerById(@PathVariable Long id) {
			return service.getSellerById(id);
		}
		
		@GetMapping("/seller/findAll")
		private List<Seller> getAllSellers(){
			return service.getAllSellers();
		}
		
		@DeleteMapping("/seller/delete/{id}")
		private String deleteSellerById(@PathVariable Long id) {
			service.deleteSeller(id);
			return "Seller Deleted successfully";
		}
		
		@PutMapping("/seller/update/{id}")
		private Seller updateSeller(@RequestBody Seller seller,@PathVariable Long id) {
			return service.updateSeller(seller, id);
		}
	}



