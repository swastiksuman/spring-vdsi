package com.demo.spring.dao;

public class Customer {
	private int custId;
	private String name;
	private String city;
	private String email;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String name, String city, String email) {
		this.custId = custId;
		this.name = name;
		this.city = city;
		this.email = email;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {

		return custId + " " + name + " " + city + " " + email;
	}

}
