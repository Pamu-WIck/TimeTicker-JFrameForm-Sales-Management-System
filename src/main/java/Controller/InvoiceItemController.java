package Controller;

import DBAccess.InvoiceItemAccess;
import Model.InvoiceItem;

public class InvoiceItemController {
    
    InvoiceItemAccess i1;
    InvoiceItem inv;
    
 public InvoiceItemController(){
        i1 = new InvoiceItemAccess();
    }
    
    public InvoiceItem AddInvoiceItem(String InvoiceId ,String Quantity, String CustomerId, String WatchID){
        inv = new InvoiceItem(InvoiceId, Quantity, CustomerId, WatchID);
        return inv;
    }
    
    public boolean AddtoDB(InvoiceItem inv){
        boolean result = i1.addInvoiceItem(inv);
        return result;
    }
    
    public boolean UpdateDB(String InvoiceId ,String Quantity, String CustomerId, String WatchID){
        boolean result = i1.UpdateInvoiceItem(InvoiceId, Quantity, CustomerId, WatchID);
        return result;
    }
    
    public boolean DeleteDB(String InvoiceId, String Quantity, String CustomerId, String WatchID){
        boolean result = i1.DeleteInvoiceItem(InvoiceId,Quantity,CustomerId,WatchID);
        return result;
    }
    
}