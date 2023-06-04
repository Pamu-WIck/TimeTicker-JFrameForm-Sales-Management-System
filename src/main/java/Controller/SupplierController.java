package Controller;

import DBAccess.SupplierAccess;
import Model.Supplier;

public class SupplierController {
    
    SupplierAccess s1;
    Supplier sup;
    
    public SupplierController(){
        s1 = new SupplierAccess();
    }
    
    public Supplier AddSupplier(String SupplierID, String CompanyName, String WatchID, String PartID){
        sup = new Supplier(SupplierID, CompanyName, WatchID, PartID);
        return sup;
    }
    
    public boolean AddtoDB(Supplier su){
        boolean result = s1.addSupplier(su);
        return result;
    }
    
    public boolean UpdateDB(String SupID, String CompanyName, String WatchID, String PartID){
        boolean result = s1.UpdateSupplier(SupID, CompanyName, WatchID, PartID);
        return result;
    }
    
    public boolean DeleteDB(String SupID){
        boolean result = s1.DeleteSupplier(SupID);
        return result;
    }
}
