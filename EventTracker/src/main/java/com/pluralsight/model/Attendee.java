package com.pluralsight.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.pluralsight.view.Phone;

public class Attendee {
	
	@Phone
	@NotEmpty
	private String phone;
	
	@Size(min=2, max=30)
	private String name;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Email
	@NotEmpty
	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Attendee [phone=" + phone + ", name=" + name + ", emailAddress=" + emailAddress + "]";
	}
}
