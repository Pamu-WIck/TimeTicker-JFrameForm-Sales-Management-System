package DBAccess;

import Model.Customer;
import DataBaseConnection.DBconnector;

public class CustomerAccess {
    private DBconnector db1;
    
    public CustomerAccess(){
        db1 = DBconnector.getSingleInstance();
    }
    
    public boolean addCustomer(Customer objCus ){
        try {
            String query = "insert into customers values ('"+objCus.getCustomerID()+"','"+objCus.getName()+"','"+objCus.getAddress()+"','"+objCus.getEmail()+"','"+objCus.getPhoneNo()+"')";
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean UpdateCustomer( String CusName, String Address, String Email, String PhoneNo ){
        try {
            String query = "update customers set  Email = '"+Email+"', PhoneNo =  '"+PhoneNo+"' where Name = '"+CusName+"', Address = '"+Address+"' " ;
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public boolean DeleteCustomer(   String CusName, String Address) {
        try {
            String query = "update customers set  Email = 'null', PhoneNo =  null where Name = '"+CusName+"', Address = '"+Address+"' " ;
            boolean result = db1.ExecuteQuary(query);
            return result;

        } catch (Exception e) {
            return false;
        }
    }
}
