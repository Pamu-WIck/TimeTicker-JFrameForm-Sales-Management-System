package DBAccess;

import Model.Login;
import DataBaseConnection.DBconnector;

public class LoginAccess {
    private DBconnector db1;
    
    public LoginAccess(){
        db1 = DBconnector.getSingleInstance();
    }
    
    public boolean add(Login objLog ){
        try {
            String query = "insert into  values ('"+objLog.getName()+"','"+objLog.getEmail()+"','"+objLog.getPassword()+"')";
            boolean result = db1.ExecuteQuary(query);
            return result;
            
        } catch (Exception e) {
            return false;
        }
    }
    
}
