package DBAccess;

import Model.Watch;
import DataBaseConnection.DBconnector;

public class WatchAccess {
    private DBconnector db1;
    
    public WatchAccess(){
        db1 = DBconnector.getSingleInstance();
    }
   
    public boolean addWatch(Watch objWat ){
        try {
            String query = "insert into watch values ('"+objWat.getWatchID()+"','"+objWat.getBrand()+"','"+objWat.getMaterial()+"','"+objWat.getUnitPrice()+"')";
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean UpdateWatch (String WatchID, String Brand, String Material, String ItemPrice ){
        try {
            String query = "update watch set BrandName = '"+Brand+"', Material = '"+Material+"', UnitPrice = '"+ItemPrice+"' where WatchID = '"+WatchID+"'  " ;
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public boolean DeleteWatch(String WatchID) {
        try {
            String query = "DELETE FROM watch WHERE `watch`.`WatchID` = '"+WatchID+"'" ;
            boolean result = db1.ExecuteQuary(query);
            return result;

        } catch (Exception e) {
            return false;
        }
    }

}
