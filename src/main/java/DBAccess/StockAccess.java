package DBAccess;

import Model.Stock;
import DataBaseConnection.DBconnector;

public class StockAccess {
    private DBconnector db1;

    public StockAccess(){
        db1 = DBconnector.getSingleInstance();
    }

    public boolean addStock(Stock objStk ){
        try {
            String query = "insert into Stock values ('"+objStk.getpartId()+"','"+objStk.getWatchID()+"','"+objStk.getItemPrice()+"','"+objStk.getQuantity()+"')";
            boolean result = db1.ExecuteQuary(query);
            return result;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean UpdateStock(String partId, String WatchID, String ItemPrice, String Quntity){
        try {
            String query =" UPDATE `stock` SET `WatchID` = '"+WatchID+"', `Quantity` = '"+Quntity+"', `UnitPrice` = '"+ItemPrice+"' WHERE `stock`.`PartID` = '"+partId+"' ";
            boolean result = db1.ExecuteQuary(query);
            return result;

        } catch (Exception e) {
            return false;
        }
    }


    public boolean DeleteStock(String partId){
        try {
            String query = "DELETE FROM stock WHERE `stock`.`PartID` = '"+partId+"' ";
            boolean result = db1.ExecuteQuary(query);
            return result;

        } catch (Exception e) {
            return false;
        }
    }

}