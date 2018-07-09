package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
	}
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
		System.out.format("Constructor Injection: %s%n", this.customerRepository.toString());
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}


	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.format("Setter Injection: %s%n", this.customerRepository.toString());
	}
}
