package Controller;

import DBAccess.StockAccess;
import Model.Stock;

public class StockController {

    StockAccess s1;
    Stock stk;

    public StockController(){
        s1 = new StockAccess();
    }

    public Stock AddStock(String partId, String WatchID, String ItemPrice, String Quntity){
        stk = new Stock(partId, WatchID, ItemPrice, Quntity);
        return stk;
    }

    public boolean AddtoDB(Stock st){
        boolean result = s1.addStock(st);
        return result;
    }

    public boolean UpdateDB(String partId, String WatchID, String ItemPrice, String Quntity){
        boolean result = s1.UpdateStock(partId, WatchID, ItemPrice, Quntity);
        return result;
    }

    public boolean DeleteDB(String partId){
        boolean result = s1.DeleteStock(partId);
        return result;
    }
}