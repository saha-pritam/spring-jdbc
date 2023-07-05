package org.pritam.springjdbc.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAOImplementation implements CustomerDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createCustomerTable() {
		String dropTableQuery="drop table if exists Customers";
		String createTableQuery="create table Customers"
				+ "("
				+ "CustomerID integer primary key auto_increment,"
				+ "CustomerName varchar(50),"
				+ "ContactName	varchar(50),"
				+ "Address varchar(50),"
				+ "City varchar(50),"
				+ "PostalCode varchar(50),"
				+ "Country varchar(50)"
				+ ")";
		jdbcTemplate.execute(dropTableQuery);
		System.out.println("Customers Table Dropped If Existed.");
		jdbcTemplate.execute(createTableQuery);
		System.out.println("Customers Table Created.");
	}
}
