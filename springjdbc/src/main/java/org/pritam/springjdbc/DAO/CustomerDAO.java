package org.pritam.springjdbc.DAO;

import org.pritam.springjdbc.entity.Customer;

public interface CustomerDAO {
	public void createCustomerTable();
	
	public int insert(Customer customer);
}
