package Controller;

import DBAccess.SparePartsAccess;
import Model.SpareParts;

public class SparePartsController {
    
    SparePartsAccess sp1;
    SpareParts spre;
    
    public SparePartsController(){
        sp1 = new SparePartsAccess();
    }
    
    public SpareParts AddSpareParts(String PartID , String WatchID ,String Quantity){
        spre = new SpareParts(PartID, WatchID ,Quantity);
        return spre;
    }
    
    public boolean AddtoDB(SpareParts sp){
        boolean result = sp1.addSpareParts(sp);
        return result;
    }  
}