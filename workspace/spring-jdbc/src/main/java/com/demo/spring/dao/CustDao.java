package com.demo.spring.dao;

import java.util.List;

public interface CustDao {
public String save(Customer c);
public Customer getCustById(int custId);
public List<Customer> getAllCustomers();
}
