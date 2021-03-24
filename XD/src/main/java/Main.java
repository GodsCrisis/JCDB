import java.sql.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = Mysql.createNewConnection();
        Menu m = new Menu();
        int m1 = m.menu();
        if (m1==1) {
            User u=new User();
            boolean u1=u.Logowanie();
            if (u1 == true) {
                Zmienne z = new Zmienne();
                String z1 = z.zmienne();

                Time c = new Time();
                String c2 = c.time();

                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO prostokaty(boka,bokb,przekatna,pole,obwod,czas) VALUES (" + z1 + "," + c2 + ")");
                pstmt.execute();
            } else {
                System.out.println("XD");
            }
        }
        else{
            System.out.println("XD");
        }
    }
}
