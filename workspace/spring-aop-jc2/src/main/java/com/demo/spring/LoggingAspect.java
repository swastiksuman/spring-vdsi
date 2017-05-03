package com.demo.spring;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	Logger log = Logger.getLogger(getClass());

	@Around("execution(* com.demo.spring.Cust*.register*(..))")
	public Object invoke(ProceedingJoinPoint pjp) throws Throwable {

		Object retVal = "";
		log.info("Before Calling the method");
		retVal=pjp.proceed();
		log.info("After Returning from the method...");
		
		return retVal;
	}

}
