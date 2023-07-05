package org.pritam.springjdbc.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustomerID(rs.getInt("CustomerID"));
		customer.setCustomerName(rs.getString("CustomerName"));
		customer.setContactName(rs.getString("ContactName"));
		customer.setAddress(rs.getString("Address"));
		customer.setCity(rs.getString("City"));
		customer.setPostalCode(rs.getString("PostalCode"));
		customer.setCountry(rs.getString("Country"));
		return customer;
	}
}
