package org.pritam.springjdbc;

import org.pritam.springjdbc.DAO.CustomerDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        
        //Topic - 6
        customerDAO.createCustomerTable();
        
        ((ConfigurableApplicationContext)context).close();
    }
}
