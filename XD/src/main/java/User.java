import java.sql.*;
import java.util.Scanner;

public class User {
    public static boolean Logowanie() throws SQLException {

            Connection conn = Mysql.createNewConnection();
            System.out.println("Podaj Login: ");
            Scanner scan = new Scanner(System.in);
            String scan1 = scan.nextLine();

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("Select password from user where login='" + scan1+"'");
            while(rs.next()) {
                String haslo = rs.getString(1);
                System.out.println("Podaj hasło: ");
                Scanner scan2=new Scanner(System.in);
                String scan3=scan2.nextLine();
                return haslo.equals(scan3);
            }

        return true;
    }


    }

