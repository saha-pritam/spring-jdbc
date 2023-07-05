package org.pritam.springjdbc;

import org.pritam.springjdbc.DAO.CustomerDAO;
import org.pritam.springjdbc.entity.Customer;
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
        
        //Topic - 7
        Customer customer1 = new Customer("Alfreds Futterkiste","Maria Anders","Obere Str. 57","Berlin","12209","Germany");
        Customer customer2 = new Customer("Ana Trujillo Emparedados y helados","Ana Trujillo","Avda. de la Constitución 2222","México D.F.","05021","Mexico");
        Customer customer3 = new Customer("Antonio Moreno Taquería","Antonio Moreno","Mataderos 2312","México D.F.","05023","Mexico");
        Customer customer4 = new Customer("Around the Horn","Thomas Hardy","120 Hanover Sq.","London","WA1 1DP","UK");
        Customer customer5 = new Customer("Berglunds snabbköp","Christina Berglund","Berguvsvägen 8","Luleå","S-958 22","Sweden");
        Customer customer6 = new Customer("Blauer See Delikatessen","Hanna Moos","Forsterstr. 57","Mannheim","68306","Germany");
        Customer customer7 = new Customer("Blondel père et fils","Frédérique Citeaux","24, place Kléber","Strasbourg","67000","France");
        
        customerDAO.insert(customer1);
        customerDAO.insert(customer2);
        customerDAO.insert(customer3);
        customerDAO.insert(customer4);
        customerDAO.insert(customer5);
        customerDAO.insert(customer6);
        customerDAO.insert(customer7);
        
      //Topic - 8
        Customer updateCustomer = new Customer(4,"Pritam Saha","Thomas Hardy","120 Hanover Sq.","London","WA1 1DP","UK");
        customerDAO.update(updateCustomer);
        
        ((ConfigurableApplicationContext)context).close();
    }
}
