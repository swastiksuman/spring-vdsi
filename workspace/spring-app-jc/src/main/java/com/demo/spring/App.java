package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = (CustomerService) ctx.getBean("customerService");

		System.out.println(service.registerCustomer(1007, "Scott"));
	}
}
