package Controller;

import DBAccess.EmployeeAccess;
import Model.Employee;

public class EmployeeController {
    
    EmployeeAccess e1;
    Employee emp;
    
    public EmployeeController(){
       e1 = new EmployeeAccess();
    }
    
    public Employee AddEmployee( String empName, String Email, String Password){
        emp = new Employee( empName, Email, Password);
        return emp;
    }
    
    public boolean AddtoDB(Employee em){
        boolean result = e1.addEmployee(em);
        return result;
    }
    
    public boolean UpdateDB( String EmployeeName,  String Email, String Password){
        boolean result = e1.UpdateEmployee( EmployeeName, Email, Password);
        return result;
    }
}

