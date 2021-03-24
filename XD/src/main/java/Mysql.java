import java.sql.*;
import java.sql.DriverManager;

public class Mysql {
    private static String host="jdbc:mysql://localhost:3306/figury";
    private static String login="root";
    private static String password="";
    private static Connection conn;
    public static Connection createNewConnection() {
            try{
                conn = DriverManager.getConnection(host, login, password);
                System.out.println("Połączono");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return conn;
    }
}
