package com.demo.spring;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	Logger log = Logger.getLogger(getClass());

	@Before("execution(* com.demo.spring.Cust*.register*(..))")
	public void logBefore() {
		log.info("Before call to method...");
	}

	@AfterReturning("execution(* com.demo.spring.Cust*.register*(..))")
	public void logAfter() {
		log.info("After call to method...");
	}

	@AfterThrowing(throwing="t",pointcut="execution(* com.demo.spring.Cust*.register*(..))")
	public void afterThrowing(NullPointerException t) {
		log.fatal("Some exception taken place....");
	}
	
	@After("execution(* com.demo.spring.Cust*.register*(..))")
	public void after(){
		log.info("This is after --finally");
	}
}
