package com.springcoders.ECommerceManagment.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcoders.ECommerceManagment.entity.Seller;
import com.springcoders.ECommerceManagment.repository.SellerRepository;


@Service
public class SellerService {
	
	@Autowired
	SellerRepository repository;
	
	public Seller addSeller(Seller seller) {
		return repository.save(seller);
	}

	public Seller getSellerById(Long id) {
		return repository.findById(id).get();
	}
	
	public List<Seller> getAllSellers(){
		List<Seller> sellers = new ArrayList<Seller>();
		repository.findAll().forEach(seller1 -> sellers.add(seller1));
		return sellers;
	}
	
	public void deleteSeller(Long id) {
		repository.deleteById(id);
	}
	
	public Seller updateSeller(Seller s, Long id) {
		
		Seller seller = repository.findById(id).get();
		
		if(seller.getName() != null) {
			seller.setName(s.getName());
		}
		if(seller.getEmail() != null) {
			seller.setEmail(s.getEmail());
		}
		if(seller.getAddress() != null) {
			seller.setAddress(s.getAddress());
		}
		if(seller.getPhNo() != null) {
			seller.setPhNo(s.getPhNo());
		}
		return repository.save(seller);
	}
}