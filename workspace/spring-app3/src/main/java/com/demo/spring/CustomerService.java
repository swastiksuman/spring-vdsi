package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
/*
 * <bean id="customerService class="com.demo.spring.CustomerService"/>
 */
public class CustomerService {

	@Autowired
	@Qualifier("daoMockHibImpl")
	Dao dao;

	

	public String registerCustomer(int custId, String custName) {
		System.out.println(dao.insert(custId, custName));
		return "Customer Registered Successfully";

	}
}
