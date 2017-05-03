package com.demo.spring;

import org.springframework.stereotype.Component;

//@Component
public class DaoMockHibImpl implements Dao {

	@Override
	public String insert(int id, String name) {
		// TODO Auto-generated method stub
		return "Hibernate:Customer Inserted with id=" + id;
	}

}
