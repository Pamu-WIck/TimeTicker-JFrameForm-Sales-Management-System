package Model;

public class InvoiceItem {
    private String InvoiceId;
    private String Quantity;
    private String CustomerId;
    private String WatchID;

    public InvoiceItem(String InvoiceId ,String Quantity, String CustomerId, String WatchID) {
        this.InvoiceId = InvoiceId;
        this.Quantity = Quantity;
        this.CustomerId = CustomerId;
        this.WatchID = WatchID;
        }
      public String getInvoiceId() {
        return InvoiceId;
    }

    public void setInvoiceId(String InvoiceId) {
        this.InvoiceId = InvoiceId;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getWatchID() {
        return WatchID;
    }

    public void setWatchID(String WatchID) {
        this.WatchID = WatchID;
    }
}
