package DBAccess;

import Model.RepairJobs;
import DataBaseConnection.DBconnector;

public class RepairJobsAccess {
    private DBconnector db1;
    
    public RepairJobsAccess(){
        db1 = DBconnector.getSingleInstance();
    }
    
    public boolean addRepairJobs(RepairJobs objRepairJ ){
        try {
            String query = "insert into repairJobs values ('"+objRepairJ.getTaskID()+"','"+objRepairJ.getEmpID()+"','"+objRepairJ.getInvoiceID()+"','"+objRepairJ.getReturnDate()+"',"+objRepairJ.getDescription()+")";
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean UpdateRepairJobs(String TaskID, String EmpID,  String InvoiceID, String ReturnDate, String Description ){
        try {
            

            String query = "update repairJobs set  EmployeeID = '"+EmpID+"' ,InvoiceID = '"+InvoiceID+"', Date = '"+ReturnDate+"', Description =  "+Description+" where TaskID = '"+TaskID+"' " ;
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public boolean DeleteRepairJobs(String TaskID) {
        try {
            String query = "DELETE FROM `repairjobs` WHERE `repairjobs`.`TaskID` = '"+TaskID+"'";
            boolean result = db1.ExecuteQuary(query);
            return result;

        } catch (Exception e) {
            return false;
        }
    }

  
}
