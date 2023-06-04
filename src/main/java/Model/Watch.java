package Model;

import java.util.jar.Attributes;

public class Watch {
    private String WatchID;
    private String Brand;
    private String Material;
    private String UnitPrice;
 
    public Watch(String WatchID, String Brand, String Material, String UnitPrice) {
        this.WatchID = WatchID;
        this.Brand = Brand;
        this.Material = Material;
        this.UnitPrice = UnitPrice;
    }


    public String getWatchID() {
        return WatchID;
    }

    public void setWatchID(String WatchID) {
        this.WatchID = WatchID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

  

    
}
