package com.demo.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CustDaoJdbcImpl implements CustDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public String save(final Customer c) {
		int rows = jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement pst = conn
						.prepareStatement("insert into customers(CUSTID,NAME,CITY,EMAIL) values(?,?,?,?)");
				pst.setInt(1, c.getCustId());
				pst.setString(2, c.getName());
				pst.setString(3, c.getCity());
				pst.setString(4, c.getEmail());
				return pst;
			}
		});
		if (rows == 1)
			return "Customer Saved successfully";
		else
			return "Customer not Saved..";
	}

	public Customer getCustById(int custId) {
		Customer c = jdbcTemplate.queryForObject("Select * from customers where custid=" + custId + "",
				new RowMapper<Customer>() {
					public Customer mapRow(ResultSet rs, int arg1) throws SQLException {

						return new Customer(rs.getInt("CUSTID"), rs.getString("NAME"), rs.getString("CITY"),
								rs.getString("EMAIL"));

					}
				});
		return c;
	}

	public List<Customer> getAllCustomers() {
		List<Customer> custList = jdbcTemplate.query("Select * from customers", new RowMapper<Customer>() {
			public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				return new Customer(rs.getInt("CUSTID"), rs.getString("NAME"), rs.getString("CITY"),
						rs.getString("EMAIL"));
	
			}
		});

		return custList;
	}
}
