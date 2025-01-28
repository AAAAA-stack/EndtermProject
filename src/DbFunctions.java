import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbFunctions {
    public Connection connect_to_db(String dbname, String user, String pass){
        Connection con = null;
        try{
            Class.forName ("org.postgresql.Driver");
            con = DriverManager.getConnection ("jdbc:postgresql://localhost:5432/"+ dbname, user, pass);
            if (con != null){
                System.out.println("Connection Established!");
            } else {
                System.out.println("Connection Failed!");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
    public void createTable (Connection con, String table_name){
        Statement stmt = null;
        try{
            String sql = "CREATE TABLE " + table_name + "(empid Serinal, name varchar(200), address varchar(200))";
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
