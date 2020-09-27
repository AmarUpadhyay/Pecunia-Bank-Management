package com.capgemini.pecunia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capgemini.pecunia.entity.Customer;
import com.capgemini.pecunia.repository.CustomerRepository;

@Service
public class CustomerServiceImpl {

	@Autowired
	private CustomerRepository repository;
	
	
	//post
	
	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}
	
	
	//get
	
	public List<Customer> getCustomers(){
		return repository.findAll();
	}
	
	public Customer getCustomerById(long custId){
		return repository.findById(custId).orElse(null);
	}
	
	
	//delete
	
	public String deleteCustomer(long custId) {
		repository.deleteById(custId);
		return "customer removed and Customer Id=" + custId;
	}
	
	//put
	public Customer updateCustomer(Customer customer) {
		Customer existingCustomer=repository.findById(customer.getCustId()).orElse(null);
		existingCustomer.setAddress(customer.getAddress());
		existingCustomer.setCustContact(customer.getCustContact());
		existingCustomer.setCustName(customer.getCustName());
		return repository.save(existingCustomer);
		
	}
}
