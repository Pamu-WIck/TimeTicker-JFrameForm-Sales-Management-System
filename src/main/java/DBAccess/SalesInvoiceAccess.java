package DBAccess;

import Model.SalesInvoice;
import DataBaseConnection.DBconnector;

public class SalesInvoiceAccess {
    private DBconnector db1;
    
    public SalesInvoiceAccess(){
        db1 = DBconnector.getSingleInstance();
    }
    
    public boolean addSalesInvoice(SalesInvoice objSiv ){
        try {
            String query = "insert into invoices values ('"+objSiv.getInvoiceID()+"','"+objSiv.getCustomerID()+"','"+objSiv.getWatchID()+"', '"+objSiv.getUntiPrice()+"', '"+objSiv.getQuantity()+"' ) ";
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean UpdateSalesInvoice(String InvoiceID, String CustomerID, String WatID, String UnitPrice, String Quantity ){
        try {
            String query = "UPDATE `invoices` SET CustomerID = '"+CustomerID+"', WatchID = '"+WatID+"', UnitPrice = '"+UnitPrice+"', `Quantity` = '"+Quantity+"' WHERE `invoices`.`InvoiceID` = '"+InvoiceID+"' ";
            //String query = "update invoices set CustomerID = '"+CusID+"', Quantity = '"+Quantity+"' where WatchID = '"+WatID+"'" ;
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public boolean DeleteSalesInvoice(String InvoiceID) {
        try {
            String query = "DELETE FROM `invoices` WHERE `invoices`.`InvoiceID` = '"+InvoiceID+"' ";
            boolean result = db1.ExecuteQuary(query);
            return result;

        } catch (Exception e) {
            return false;
        }
    }
}
