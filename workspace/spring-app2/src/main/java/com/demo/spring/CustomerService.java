package com.demo.spring;

public class CustomerService {

	Dao dao;

	public CustomerService(Dao dao) {
		this.dao = dao;
	}

	/*public void setDao(Dao dao) {
		this.dao = dao;
	}*/

	public String registerCustomer(int custId, String custName) {
		System.out.println(dao.insert(custId, custName));
		return "Customer Registered Successfully";

	}
}
