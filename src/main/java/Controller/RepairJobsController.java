package Controller;

import DBAccess.RepairJobsAccess;
import Model.RepairJobs;

public class RepairJobsController {
    
    RepairJobsAccess j1;
    RepairJobs repJobs;
    
    public RepairJobsController(){
       j1 = new RepairJobsAccess();
    }
    
    public RepairJobs AddRepairJobs(String TaskID,String EmpID, String InvoiceID, String PartID, String Description){
        repJobs = new RepairJobs(TaskID, EmpID, InvoiceID, PartID,Description);
        return repJobs;
    }
    
    public boolean AddtoDB(RepairJobs rj){
        boolean result = j1.addRepairJobs(rj);
        return result;
    }
    
    public boolean UpdateDB(String TaskID, String EmpID, String InvoiceID, String PartID, String Description){
        boolean result = j1.UpdateRepairJobs(TaskID, EmpID, InvoiceID, PartID, Description);
        return result;
    }
    
    public boolean DeleteDB(String TaskID){
        boolean result = j1.DeleteRepairJobs(TaskID);
        return result;
    }
}

