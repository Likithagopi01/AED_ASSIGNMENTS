/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;


import Business.Organization;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer extends Organization{
    
    String customerName;
    String customerAddress;
    int customerPhone;
    String customerLandmark;
 
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerLandmark() {
        return customerLandmark;
    }

    public void setCustomerLandmark(String customerLandmark) {
        this.customerLandmark = customerLandmark;
    }
    
       public Customer() {
        super(Organization.Type.Customer.getValue());
       
    }
       
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerRole());
        return roles;
    }
    
    @Override
    public String toString(){
        return customerName;
    }
    
}
