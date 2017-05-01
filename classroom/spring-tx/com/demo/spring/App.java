package com.demo.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-tx.xml");
		Dao dao = (Dao) ctx.getBean("dao");

		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp(107, "Pavan", "Hyderabad", 70000));
		empList.add(new Emp(108, "Ketan", "Hyderabad", 65000));
		empList.add(new Emp(109, "Chiru", "Bangalore", 55000));
		empList.add(new Emp(105, "Shantanu", "Hyderabad", 60000));
		empList.add(new Emp(106, "Raju", "Chennai", 70000));
		
		dao.save(empList);
	}
}
