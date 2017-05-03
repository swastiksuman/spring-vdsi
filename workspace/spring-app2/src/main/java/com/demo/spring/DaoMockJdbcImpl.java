package com.demo.spring;

public class DaoMockJdbcImpl implements Dao {

	@Override
	public String insert(int id, String name) {
		// TODO Auto-generated method stub
		return "Customer Inserted with id=" + id;
	}

}
