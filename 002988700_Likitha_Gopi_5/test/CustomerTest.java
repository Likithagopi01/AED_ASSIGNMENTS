/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
import Business.EcoSystem;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DB4OUtil.DB4OUtil;
import com.db4o.Db4o;
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
     
    EcoSystem system = EcoSystem.getInstance();
    DB4OUtil db =DB4OUtil.getInstance();
    
       
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
       
       assertEquals("likitha",db.retrieveSystem().getCustomerDirectory().getCustomerList().get(0).getCustomerName());
        System.out.println(db.retrieveSystem().getCustomerDirectory().getCustomerList().get(0).getCustomerName());
    }
   @Test
    public void testDeliveryName() { 

       assertEquals("tharoon",db.retrieveSystem().getDeliveryManDirectory().getDeliveryman().get(0).getDeliveryManName());
        System.out.println(db.retrieveSystem().getDeliveryManDirectory().getDeliveryman().get(0).getDeliveryManName());
    }   
    
   @Test
    public void testManagerName() { 

       assertEquals("balaji",db.retrieveSystem().getRestaurantDirectory().getRestaurantList().get(1).getManager());
        System.out.println(db.retrieveSystem().getRestaurantDirectory().getRestaurantList().get(1).getManager());
    }
    
    @Test
    public void testRestaurantName() { 

       assertEquals("bawarchi",db.retrieveSystem().getRestaurantDirectory().getRestaurantList().get(1).getName());
        System.out.println(db.retrieveSystem().getRestaurantDirectory().getRestaurantList().get(1).getName());
    } 
    
    
    
}

