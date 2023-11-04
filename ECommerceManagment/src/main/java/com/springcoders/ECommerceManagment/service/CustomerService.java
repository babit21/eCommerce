package com.springcoders.ECommerceManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcoders.ECommerceManagment.entity.Customer;
import com.springcoders.ECommerceManagment.repository.CustomerRepository;


@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).get();
	}

	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	public void deleteCustomer(Customer student) {
		customerRepository.deleteAll(getAllCustomer());
	}
	
	public String deleteCustomerById(Long id) {
		customerRepository.deleteById(id);
		return "delete Customer data successfully";
	}
	
	
	public Customer updateCustomer(Customer customers, Long id) {
		Customer customer = customerRepository.findById(id).get();
		System.out.println(customer.getName());
		
		if(customer.getName() != null) {
		customer.setName(customers.getName());
		}
		

		if(customer.getEmail() != null) {
		customer.setEmail(customers.getEmail());
		}
		

		if(customer.getContact() >0) {
		customer.setContact(customers.getContact());
		}
		

		if(customer.getAddress() != null) {
		customer.setAddress(customers.getAddress());
		}
		
		
		
		return customerRepository.save(customer);
		
		
	}

}
