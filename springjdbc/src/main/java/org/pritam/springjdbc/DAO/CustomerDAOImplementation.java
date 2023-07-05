package org.pritam.springjdbc.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAOImplementation implements CustomerDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
