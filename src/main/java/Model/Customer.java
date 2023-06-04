package Model;

import java.util.jar.Attributes;

public class Customer {
    private String CustomerID;
    private String Name;
    private String Address;
    private String Email;
    private String PhoneNo;
    

    public Customer(String CustomerID, String Name, String Address, String Email, String PhoneNo) {
        this.CustomerID = CustomerID;
        this.Name = Name;
        this.Address = Address;
        this.Email = Email;
        this.PhoneNo = PhoneNo;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }
    
    
}
