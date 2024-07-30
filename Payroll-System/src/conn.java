import java.sql.*;

public class conn {
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","PROJECT","project2024");
            s = c.createStatement();
            
        
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 
