package Model;

import java.util.jar.Attributes;

public class Supplier {
    private String SupplierID;
    private String CompanyName;
    private String WatchID;
    private String PartID;

    

    public Supplier(String SupplierID, String CompanyName, String WatchID, String PartID) {
        this.SupplierID = SupplierID;
        this.CompanyName = CompanyName;
        this.WatchID = WatchID;
        this.PartID = PartID;
        
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public String getWatchID() {
        return WatchID;
    }

    public void setWatchID(String WatchID) {
        this.WatchID = WatchID;
    }

    public String getPartID() {
        return PartID;
    }

    public void setPartID(String PartID) {
        this.PartID = PartID;
    }
}
