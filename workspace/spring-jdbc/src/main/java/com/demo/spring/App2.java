package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class App2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt = (JdbcTemplate) ctx.getBean("jdbcTemplate");

		jt.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement pst = conn
						.prepareStatement("insert into customers(CUSTID,NAME,CITY,EMAIL) values(?,?,?,?)");
				pst.setInt(1, 10014);
				pst.setString(2, "Ankit");
				pst.setString(3, "Hyderabad");
				pst.setString(4, "ankit@zulu.com");
				return pst;
			}
		});
	}
}
