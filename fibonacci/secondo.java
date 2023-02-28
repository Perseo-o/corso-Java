package fibonacci;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public class secondo{

    public static void main(String[] args) {
        Connection conn=null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "3469587");
            if (conn != null) {
            System.out.println("Connesso");
            } else {
            System.out.println("Connessione fallita");
            }
            // Prova lettura db
            String query = "SELECT * FROM city LIMIT 5";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
            String tableFormat = String.format("ID: %s Name: %s CountryCode: %s District: %s Population: %s",
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5));
            System.out.println(tableFormat);
            
            
            }
            
            } catch (Exception e) {
            e.printStackTrace();
            }
    }


}