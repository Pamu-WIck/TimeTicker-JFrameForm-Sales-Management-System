package DBAccess;

import Model.SpareParts;
import DataBaseConnection.DBconnector;

public class SparePartsAccess {
    private DBconnector db1;
    
    public SparePartsAccess(){
        db1 = DBconnector.getSingleInstance();
    }
    
    public boolean addSpareParts(SpareParts objspre ){
        try {
            String query = "insert into spareParts values ('"+objspre.getPartID()+"','"+objspre.getWatchID()+"','"+objspre.getQuantity()+"')";
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    } 
}