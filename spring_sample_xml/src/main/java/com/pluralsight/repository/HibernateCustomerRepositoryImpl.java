package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${db.username}")
	private String dbPassword;

	@Value("${db.password}")
	private String dbUsername;

	@Override
	public List<Customer> findAll() {
		var customers = new ArrayList<Customer>();

		var customer = new Customer();

		customer.setFirstname("Ákos");
		customer.setLastname("Németh");

		customers.add(customer);

		return customers;
	}
	@Override
	public String toString() {
		return "HibernateCustomerRepositoryImpl [dbPassword=" + dbPassword + ", dbUsername=" + dbUsername
				+ ", findAll()=" + findAll() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

}
