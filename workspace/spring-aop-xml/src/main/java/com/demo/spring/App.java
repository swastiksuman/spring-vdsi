package com.demo.spring;

import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
		
		Performer singer =  (Performer)ctx.getBean("singer");
		
		//Object singer =  ctx.getBean("singer");
		
		/*System.out.println(singer.getClass().getName());
		
		Method[] methods=singer.getClass().getMethods();
		
		for(Method m:methods){
			System.out.println(m.getName());
		}*/
		
		singer.perform();
	}
}
