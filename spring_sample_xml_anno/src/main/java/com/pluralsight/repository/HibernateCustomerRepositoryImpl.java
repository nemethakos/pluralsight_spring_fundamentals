package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Named
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public String toString() {
		return "HibernateCustomerRepositoryImpl [findAll()=" + findAll() + "]";
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Ákos");
		customer.setLastname("Németh");
		
		customers.add(customer);
		
		return customers;
	}
	
}
