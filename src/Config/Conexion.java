
package Config;

import java.sql.DriverManager;
import java.sql.*;

public class Conexion {
    Connection con;
    
    public Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3307/farmacia", "root","" );
        }catch(Exception e){
            System.out.println("Error;   "+e.getMessage());
        }
           
    }
    
    public Connection getConnection(){
        return con;
    }
}

