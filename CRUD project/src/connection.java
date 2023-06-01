import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {
    static Connection con = null;
    public static Connection connectDb(){
        try{
            String url = "jdbc:mysql://localhost:3306/dev";
            String user = "root";
            String password = "Mahakal@786";

            con = DriverManager.getConnection(url,user,password);

        }catch(Exception e){
            System.out.println("Connection fail due to: "+e);
        }
        return con;
    }
}
