package DBAccess;

import Model.Employee;
import DataBaseConnection.DBconnector;

public class EmployeeAccess {
    private DBconnector db1;
    
    public EmployeeAccess(){
        db1 = DBconnector.getSingleInstance();
    }
    
    public boolean addEmployee(Employee objEmp ){
        try {
            String query = "insert into employee values ('"+objEmp.getEmpName()+"','"+objEmp.getEmail()+"','"+objEmp.getPassword()+"')";
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean UpdateEmployee(String empName, String Email, String Password ){
        try {
            String query = "update employee set  Email = '"+Email+"', Password =  "+Password+" where EmpName = '"+empName+"'  " ;
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public boolean DeleteEmployee(String EmpID, String empName) {
        try {
            String query = "update employee set Name = '" + empName + "', Email = 'null', PhoneNo =  null where CustomerID = '"+EmpID+"' ";
            boolean result = db1.ExecuteQuary(query);
            return result;

        } catch (Exception e) {
            return false;
        }
    }
}
