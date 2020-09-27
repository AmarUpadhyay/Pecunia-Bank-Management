package com.capgemini.pecunia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.entity.Customer;
import com.capgemini.pecunia.service.CustomerServiceImpl;

@RestController
public class CustomerController {

	@Autowired
	private CustomerServiceImpl service;
	
	
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	
	
	@GetMapping("/customers")
	public List<Customer> findAllCustomers(){
		return service.getCustomers();
	}
	@GetMapping("/customers/{custId}")
	public Customer findById(@PathVariable int custId){
		return service.getCustomerById(custId);
	}
	
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}
	
	@DeleteMapping("/delete/{custId}")
	public String deleteCustomer(@PathVariable int custId) {
		return service.deleteCustomer(custId);
	}
	
}
