package org.pritam.springjdbc;

import org.pritam.springjdbc.DAO.CustomerDAO;
import org.pritam.springjdbc.DAO.CustomerDAOImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JavaConfiguration {
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/srpingjdbc","root","9er$Y%F49yD4");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return driverManagerDataSource;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean("customerDAO")
	public CustomerDAO getCustomerDAO() {
		CustomerDAO customerDAO = new CustomerDAOImplementation();
		return customerDAO;
	}

}
