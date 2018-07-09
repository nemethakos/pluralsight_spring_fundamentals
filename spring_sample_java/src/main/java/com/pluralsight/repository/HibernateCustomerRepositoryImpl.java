package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${db.username}")
	private String dbUser;
	
	@Override
	public String toString() {
		return "HibernateCustomerRepositoryImpl [findAll()=" + findAll() + "]";
	}

	@Override
	public List<Customer> findAll() {
		
		System.out.println("db user="+dbUser);
		
		List<Customer> customers = new ArrayList<>();

		customers.add(new Customer("�kos", "N�meth"));
		customers.add(new Customer("John", "Doe"));

		return customers;
	}

}
