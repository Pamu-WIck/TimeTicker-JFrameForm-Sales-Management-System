package DBAccess;

import Model.Supplier;
import DataBaseConnection.DBconnector;

public class SupplierAccess {
    private DBconnector db1;
    
    public SupplierAccess(){
        db1 = DBconnector.getSingleInstance();
    }
    
    public boolean addSupplier(Supplier objSup ){
        try {
            String query = "insert into supplier values ('"+objSup.getSupplierID()+"','"+objSup.getCompanyName()+"','"+objSup.getWatchID()+"','"+objSup.getPartID()+"')";
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean UpdateSupplier(String SupID, String CompanyName, String WatchID, String PartID){
        try {
            String query = "UPDATE `supplier` SET `CompanyName` = '"+CompanyName+"', WatchID = '"+WatchID+"', PartID = '"+PartID+"'  WHERE `supplier`.`SupplierID` = '"+SupID+"' ";
            //String query = "update supplier set CompanyName = '"+CompanyName+"', WatchID = '"+WatchID+"', PartID = '"+PartID+"' where SupplierID = '"+SupID+"'  " ;
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public boolean DeleteSupplier(String SupID) {
        try {
            String query = "DELETE FROM `supplier` WHERE `supplier`.`SupplierID` = '"+SupID+"' ";
            boolean result = db1.ExecuteQuary(query);
            return result;

        } catch (Exception e) {
            return false;
        }
    }
}
