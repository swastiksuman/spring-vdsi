package com.demo.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Query1 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt = (JdbcTemplate) ctx.getBean("jdbcTemplate");

		List<String> custList = jt.query("select * from customers", new RowMapper<String>() {

			public String mapRow(ResultSet rs, int idx) throws SQLException {

				return rs.getInt("CUSTID") + " " + rs.getString("NAME") + " " + rs.getString("CITY") + " "
						+ rs.getString("EMAIL");
			}

		});

		for (String s : custList) {
			System.out.println(s);
		}
		System.out.println("-----------------------");

		String data = jt.queryForObject("Select * from customers where custid=10007", new RowMapper<String>() {
			public String mapRow(ResultSet rs, int arg1) throws SQLException {

				return rs.getInt("CUSTID") + " " + rs.getString("NAME") + " " + rs.getString("CITY") + " "
						+ rs.getString("EMAIL");

			}
		});

		System.out.println(data);
	}
}
