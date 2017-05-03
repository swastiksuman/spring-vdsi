package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context2.xml");
		Mail mail = (Mail) ctx.getBean("mail");

		System.out.println(mail.getMessage().getBody());
		
		mail.getMessage().setBody("Tea bReak at 4:00pm");

		Mail mail1 = (Mail) ctx.getBean("mail");

		System.out.println(mail1.getMessage().getBody());
		System.out.println(mail.hashCode()==mail1.hashCode());
		System.out.println(mail.getToAddress()[0]);
	}
}
