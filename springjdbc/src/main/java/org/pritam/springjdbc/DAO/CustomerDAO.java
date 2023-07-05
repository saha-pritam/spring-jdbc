package org.pritam.springjdbc.DAO;

import java.util.List;

import org.pritam.springjdbc.entity.Customer;

public interface CustomerDAO {
	public void createCustomerTable();
	
	public int insert(Customer customer);
	
	public int update(Customer customer);
	
	public int delete(int customerId);
	
	public Customer getCustomerById(int customerID);
	
	public List<Customer> getAllCustomers();
}
