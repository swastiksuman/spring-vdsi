package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.demo.spring" })
public class AppConfig {

	@Bean
	public DaoMockHibImpl daoMockHibImpl(){
		DaoMockHibImpl dao= new DaoMockHibImpl();
		return dao;
	}
}
