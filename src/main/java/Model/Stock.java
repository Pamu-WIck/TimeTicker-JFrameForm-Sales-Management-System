package Model;


public class Stock {
    private String partId;
    private String WatchID;
    private String ItemPrice;
    private String Quantity;


    public Stock(String partId, String WatchID, String ItemPrice, String Quantity) {
        this.partId = partId;
        this.WatchID = WatchID;
        this.ItemPrice = ItemPrice;
        this.Quantity = Quantity;
    }

   
    public String getpartId() {
        return partId;
    }

    public void setpartId(String partId) {
        this.partId = partId;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuntity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(String ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public String getWatchID() {
        return WatchID;
    }

    public void setWatchID(String WatchID) {
        this.WatchID = WatchID;
    }

}