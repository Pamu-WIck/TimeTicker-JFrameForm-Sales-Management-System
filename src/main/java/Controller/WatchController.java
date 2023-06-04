package Controller;

import DBAccess.WatchAccess;
import Model.Watch;

public class WatchController {
    
    WatchAccess w1;
    Watch wat;
    
    public WatchController(){
        w1 = new WatchAccess();
    }
    
    public Watch AddWatch(String WatchID, String Brand, String Material, String ItemPrice ){
        wat = new Watch(WatchID, Brand, Material, ItemPrice);
        return wat;
    }
    
    public boolean AddtoDB(Watch wa){
        boolean result = w1.addWatch(wa);
        return result;
    }
    
    public boolean UpdateDB(String WatchID, String Brand, String Material, String ItemPrice ){
        boolean result = w1.UpdateWatch(WatchID, Brand, Material, ItemPrice);
        return result;
    }
    
    public boolean DeleteDB(String SupID){
        boolean result = w1.DeleteWatch(SupID);
        return result;
    }
}
