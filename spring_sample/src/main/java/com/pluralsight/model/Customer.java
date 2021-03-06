package com.pluralsight.model;

public class Customer {
	
	private String firstname;
	private String lastname;

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	public Customer() {
		
	}
	
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
