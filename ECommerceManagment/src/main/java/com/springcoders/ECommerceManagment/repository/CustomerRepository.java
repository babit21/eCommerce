package com.springcoders.ECommerceManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcoders.ECommerceManagment.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	

}
