package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.spring.dao.CustDao;
import com.demo.spring.dao.Customer;

public class DoaApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CustDao dao = (CustDao) ctx.getBean("custDaoJdbcImpl");

		// System.out.println(dao.save(new Customer(100016, "Chitra",
		// "Hyderabad", "chitra@zulu.com")));

		System.out.println(dao.getCustById(10007));

		for (Customer c : dao.getAllCustomers()) {
			System.out.println(c);
		}
	}
}
