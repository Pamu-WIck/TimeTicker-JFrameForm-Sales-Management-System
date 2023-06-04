package Model;


public class RepairJobs {
    private String TaskID;
    private String EmpID;
    private String InvoiceID;
    private String ReturnDate;
    private String Description;
    

    public RepairJobs(String TaskID, String EmpID, String InvoiceID, String ReturnDate, String Description) {
        this.TaskID = TaskID;
        this.EmpID = EmpID;
        this.InvoiceID = InvoiceID;
        this.ReturnDate = ReturnDate;
        this.Description = Description;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(String ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public String getTaskID() {
        return TaskID;
    }

    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getInvoiceID() {
        return InvoiceID;
    }

    public void setInvoiceID(String InvoiceID) {
        this.InvoiceID = InvoiceID;
    }


    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}
