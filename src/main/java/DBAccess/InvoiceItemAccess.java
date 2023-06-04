package DBAccess;

import Model.InvoiceItem;
import DataBaseConnection.DBconnector;
import Model.Customer;

public class InvoiceItemAccess {
private DBconnector db1;              
    
    public InvoiceItemAccess(){
        db1 = DBconnector.getSingleInstance();
    }
    public boolean addInvoiceItem(InvoiceItem objinv ){
        try {
            String query = "insert into InvoiceItem values ('"+objinv.getInvoiceId()+"','"+objinv.getQuantity()+"','"+objinv.getCustomerId()+"','"+objinv.getWatchID()+"')";
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception i) {
            return false;
        }
    }
      
    public boolean UpdateInvoiceItem(String InvoiceId ,String Quantity, String CustomerId, String WatchID ){
        try {
            String query = "update InvoiceItem set ID = '"+InvoiceId+"', Quantity = '"+Quantity+"', CustomerId = '"+CustomerId+"', WatchID =  "+WatchID+" where CustomerID = '" ;
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception i) {
            return false;
        }
    }
    
    public boolean DeleteInvoiceItem(String InvoiceId ,String Quantity, String CustomerId, String WatchID) {
        try {
            String query = "update InvoiceItem set InvoiceId  = '" + InvoiceId + "', Quantity = '" + Quantity + "', CustomerId = 'null', WatchID =  null where WatchID = '"+WatchID+"' ";
            boolean result = db1.ExecuteQuary(query);
            return result;

        } catch (Exception e) {
            return false;
        }
    }
    
}
