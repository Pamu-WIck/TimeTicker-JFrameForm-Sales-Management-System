package Controller;

import DBAccess.SalesInvoiceAccess;
import Model.SalesInvoice;

public class SalesInvoiceController {
    
    SalesInvoiceAccess s1;
    SalesInvoice siv;
    
    public SalesInvoiceController(){
        s1 = new SalesInvoiceAccess();
    }
    
    public SalesInvoice AddInvoice(String InvoiceID, String CustomerID, String WatchID, String UntiPrice, String Quantity){
        siv = new SalesInvoice(InvoiceID, CustomerID, WatchID ,UntiPrice, Quantity);
        return siv;
    }
    
    public boolean AddtoDB(SalesInvoice si){
        boolean result = s1.addSalesInvoice(si);
        return result;
    }
    
    public boolean UpdateDB(String InvoiceID,String CustomerID, String WatchID, String UntiPrice, String Quantity){
        boolean result = s1.UpdateSalesInvoice(InvoiceID, CustomerID, WatchID, UntiPrice, Quantity);
        return result;
    }
    
    public boolean DeleteDB(String InvoiceID){
        boolean result = s1.DeleteSalesInvoice(InvoiceID);
        return result;
    }
}
