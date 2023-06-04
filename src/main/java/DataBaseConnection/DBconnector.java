package DataBaseConnection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class DBconnector {
    private final String URL = "jdbc:mysql://localhost:3306/timetickerdb";
    private final String userName = "root";
    private final String Password = "";
    
    private static DBconnector instance;
    private Connection con ;
    
    private DBconnector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, userName, Password);
            System.out.println("Connected Successfully");
        }catch(SQLException ex){
            System.out.println("DataBase Connection Error "+ ex.getMessage());
        }catch(ClassNotFoundException CNex){
            System.out.println("Driver calss not found " + CNex.getMessage());
        }
    }
    
    public static DBconnector getSingleInstance(){
        try{
            if(instance == null){
                instance = new DBconnector();
            }else if(instance.con.isClosed()){
                 instance = new DBconnector();
            }else{
                return instance;
            }
        }catch(SQLException ex){
            System.out.println("Database Connection Error " + ex.getMessage());
            return null;
        }
        return instance;
    }
    
    public boolean ExecuteQuary(String sqlQ){
        try{
            Statement st = con.createStatement();
            int result = st.executeUpdate(sqlQ);
            return result > 0 ;
        }catch(SQLException ex){
            System.out.println("SQL Error " + ex.getMessage());
            return false;
        }
    }
    
    public ResultSet ShowExecuteQuary(String sqlQ){
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlQ);
            return rs ;
            
        }catch(SQLException ex){
            System.out.println("SQL Error " + ex.getMessage());
            return null;
        }
    }
}


