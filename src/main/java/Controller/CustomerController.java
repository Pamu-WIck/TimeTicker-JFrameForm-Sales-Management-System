package Controller;

import DBAccess.CustomerAccess;
import Model.Customer;

public class CustomerController {
    
    CustomerAccess c1;
    Customer cus;
    
    public CustomerController(){
        c1 = new CustomerAccess();
    }
    
    public Customer AddCustomer(String CustomerID, String Name, String Address, String Email, String PhoneNo){
        cus = new Customer(CustomerID, Name, Address, Email, PhoneNo);
        return cus;
    }
    
    public boolean AddtoDB(Customer cu){
        boolean result = c1.addCustomer(cu);
        return result;
    }
    
    public boolean UpdateDB( String CusName, String Address, String Email, String PhoneNo){
        boolean result = c1.UpdateCustomer(CusName, Address, Email, PhoneNo);
        return result;
    }
    
    public boolean DeleteDB( String CusName, String Address){
        boolean result = c1.DeleteCustomer(CusName, Address);
        return result;
    }
}
