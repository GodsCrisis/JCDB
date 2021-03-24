import java.sql.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = Mysql.createNewConnection();
        int m = new Menu().menu();
        if (m==1) {
            boolean u=new User().logowanie();
            if (u) {
                String z = new Zmienne().zmienne();

                String c = new Time().time();

                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO prostokaty(boka,bokb,przekatna,pole,obwod,czas) VALUES (" + z + "," + c + ")");
                pstmt.execute();
            } else {
                System.out.println("Złe hasło XD");
            }
        }
        else{
            System.out.println("Save the world. My final message, Goodbye.");
        }
    }
}
