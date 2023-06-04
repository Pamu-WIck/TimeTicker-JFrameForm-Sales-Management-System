package Model;

public class SpareParts {
    private String PartID;
    private String WatchID;
    private String Quantity;


    public SpareParts(String PartID, String WatchID ,String Quantity) {
        this.PartID = PartID;
        this.WatchID = WatchID;
        this.Quantity = Quantity;
    }
    
    public String getPartID() {
        return PartID;
    }

    public void setPartID(String PartID) {
        this.PartID = PartID;
    }

    public String getWatchID () {
        return WatchID ;
    }

    public void setWatchID (String WatchID  ) {
        this.WatchID  = WatchID;
    }

    public String getQuantity () {
        return Quantity;
    }

    public void setAddress(String Quantity) {
        this.Quantity = Quantity;
    }
}
