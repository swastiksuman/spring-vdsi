package com.demo.spring;

import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = (CustomerService) ctx.getBean("customerService");

		System.out.println(service.registerCustomer(1007, "Scott"));
		System.out.println(service.getClass().getName());
		
		Method[] methods=service.getClass().getMethods();
		for(Method m:methods){
			System.out.println(m.getName());
		}
	}
}
