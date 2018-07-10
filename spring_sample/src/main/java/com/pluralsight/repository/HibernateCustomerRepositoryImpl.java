package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		var customers = new ArrayList<Customer>();
		
		var customer = new Customer();
		
		customer.setFirstname("Ákos");
		customer.setLastname("Németh");
		
		customers.add(customer);
		
		return customers;
	}
	
}
