package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt = (JdbcTemplate) ctx.getBean("jdbcTemplate");

		int rows = jt.update("insert into customers(CUSTID,NAME,CITY,EMAIL) values(?,?,?,?)",
				new Object[] { 10011, "Sanjay", "Bangalore", "sanje@nowhere.com" });
		
		System.out.println("Rows Updated : " + rows);
	}
}
