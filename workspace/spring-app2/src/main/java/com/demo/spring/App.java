package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		CustomerService service= (CustomerService)ctx.getBean("service");
		
		System.out.println(service.registerCustomer(1007, "Scott"));
	}
}
