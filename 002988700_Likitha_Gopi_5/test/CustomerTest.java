/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import Business.Customer.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Likitha G
 */
public class CustomerTest {
     
           
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCustomerName() { 
        
       Customer customer = new Customer();
       customer.setCustomerName("Java");
       assertEquals("Java",customer.getCustomerName());

    }
   

}

