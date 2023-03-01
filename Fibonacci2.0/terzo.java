import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

/*Esercizio:
scrivere e mostrare con JDBC una query che vada a prendere le 
nazioni mostrando come riposta se hanno o meno una superfice di 100.000 e se hanno 
registrato un IndepYear, se è presente l'anno va mostrato altrimenti si indica che non è presente */
public class terzo {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "3469587");

            // Prova lettura db
            String query = "SELECT name as nazione, CASE WHEN SurfaceArea >=100000 THEN 'Superficie maggiore di 100k' ELSE 'Superficie inferiore a 100k' END ASSuperficie_100k, CASE WHEN INDEPYEAR IS NULL THEN 'Non esiste anno di indipendenza' ELSE indepyear END AS Anno_Indipendenza FROM country LIMIT 10;";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                String tableFormat = String.format("Name: %s | Superficie: %s |  indepyear: %s",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3));
                System.out.println(tableFormat);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}