package Model;

        
public class SalesInvoice {
    
    private String InvoiceID;
    private String CustomerID;
    private String WatchID;
    private String UntiPrice;
    private String Quantity;
    
    public SalesInvoice(String InvoiceID, String CustomerID, String WatchID, String UnitPrice, String Quantity) {
        
        this.InvoiceID = InvoiceID;
        this.CustomerID = CustomerID;
        this.WatchID = WatchID;
        this.UntiPrice = UnitPrice;
        this.Quantity = Quantity;
    }

    public String getUntiPrice() {
        return UntiPrice;
    }

    public void setUntiPrice(String UntiPrice) {
        this.UntiPrice = UntiPrice;
    }

    public String getInvoiceID() {
        return InvoiceID;
    }

    public void setInvoiceID(String InvoiceID) {
        this.InvoiceID = InvoiceID;
    }
    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getWatchID() {
        return WatchID;
    }

    public void setWatchID(String WatchID) {
        this.WatchID = WatchID;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

}