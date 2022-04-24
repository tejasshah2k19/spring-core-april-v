package com.bean;

public class UserBean {

	String firstName;
	String email;
	AddressBean address;
	PaymentBean payment;
	
	
	
	public PaymentBean getPayment() {
		return payment;
	}

	public void setPayment(PaymentBean payment) {
		this.payment = payment;
	}

	UserBean(AddressBean address) {
		this.address = address;
	}

	// you can give any name
	public void init() {
		this.firstName = "ram";
		System.out.println("init...");
	}

	public void destroy() {
		System.out.println("destroy...");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
