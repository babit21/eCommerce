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

import com.springcoders.ECommerceManagment.entity.Customer;
import com.springcoders.ECommerceManagment.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@PostMapping("/savecustomer")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	@GetMapping("/customer/find/{id}")
	public Customer findCustomerById(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	}

	@GetMapping("/customer/findAll")

	public List<Customer> findAllCustomer() {
		return customerService.getAllCustomer();

	}

	@DeleteMapping("/customer/delete")
	public String deleteCustomer(Customer customer) {
		customerService.deleteCustomer(customer);
		return "Customer Delete Successfully";
	}

	@DeleteMapping("/customer/delete/{id}")
	public String deleteCustomerById(@PathVariable Long id) {
		customerService.deleteCustomerById(id);
		return "Delete Customer Id successfully";

	}

	@PutMapping("/customer/update/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
		return customerService.updateCustomer(customer, id);
	}

}
