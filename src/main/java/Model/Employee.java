package Model;

public class Employee {
    private String empName;
    private String Email;
    private String Password;

    
  public Employee(String empName,String Email, String Password) {
        this.empName = empName;
        this.Email = Email;
        this.Password = Password;
    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

   
    
    
}

