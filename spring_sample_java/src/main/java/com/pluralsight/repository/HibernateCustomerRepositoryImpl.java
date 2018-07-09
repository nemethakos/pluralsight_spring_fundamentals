package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public String toString() {
		return "HibernateCustomerRepositoryImpl [findAll()=" + findAll() + "]";
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		customers.add(new Customer("Ákos","Németh"));
		customers.add(new Customer("John", "Doe"));
		
		
		return customers;
	}
	
}
