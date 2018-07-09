package com.pluralsight.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	/** Constructor Injection is working even when there is no annotation! */
	
	/** Constructor Injection with Spring Annotation 
	@Autowired
	*/
	
	/** Constructor Injection with JSR330 Annotation 
	@Inject
	*/
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
		System.out.format("Constructor injection: %s%n", this.customerRepository.toString());
	}

	/**
	 * Member Injection with Spring Annotation
	 @Autowired
	*/ 
	
	/** Member Injection with JSR330 Annotation 
	@Inject
	*/
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	/** 
	 * Setter Injection with Spring annotation 
	@Autowired
	*/
	
	/** 
	 * Setter Injection with JSR330 annotation 
	@Inject
	*/
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.format("Setter injection: %s%n", customerRepository.toString());
	}
}
