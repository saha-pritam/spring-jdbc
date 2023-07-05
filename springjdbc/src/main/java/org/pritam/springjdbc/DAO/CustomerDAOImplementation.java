package org.pritam.springjdbc.DAO;

import org.pritam.springjdbc.entity.Customer;
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

	public int insert(Customer customer) {
		String insertQuery="insert into customers(CustomerName,ContactName,Address,City,PostalCode,Country) values(?,?,?,?,?,?)";
		int result = jdbcTemplate.update(insertQuery, 
				customer.getCustomerName(), 
				customer.getContactName(), 
				customer.getAddress(), 
				customer.getCity(), 
				customer.getPostalCode(), 
				customer.getCountry());
		System.out.println("Row Inserted...");
		return result;
	}

	public int update(Customer customer) {
		String updateQuery="update Customers set CustomerName=?, ContactName=?, Address=?, City=?, PostalCode=?, Country=? where CustomerID=?";
		int result = jdbcTemplate.update(updateQuery, 
				customer.getCustomerName(), 
				customer.getContactName(), 
				customer.getAddress(), 
				customer.getCity(), 
				customer.getPostalCode(), 
				customer.getCountry(),
				customer.getCustomerID());
		System.out.println("Row Updated...");
		return result;
	}
}
