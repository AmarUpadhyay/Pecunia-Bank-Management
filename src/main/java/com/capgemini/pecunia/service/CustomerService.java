package com.capgemini.pecunia.service;

import java.util.List;

import com.capgemini.pecunia.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	
	public List<Customer> getCustomers();
	public Customer getCustomerById(int custId);
	public String deleteCustomer(int custId);
	public Customer updateCustomer(Customer customer);
}
