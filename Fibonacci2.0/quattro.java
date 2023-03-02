import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.util.DnsSrv.SrvRecord;

public class quattro {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "3469587");
            if (conn != null) {
                System.out.println("Connesso");
            } else {
                System.out.println("Connessione fallita");
            }
            // Prova lettura db

            System.out.println("Inserisci Codice nazione");
            Scanner nazCode = new Scanner(System.in);
            String codInput = "%" + nazCode.nextLine() + "%";
            System.out.println("Inserisci controllo popolazione superiore a:");
            Scanner pop = new Scanner(System.in);
            int popInput = pop.nextInt();
            System.out.println("Vuoi vedere il nome della nazione? 1 Si 0 No");
            Scanner nom = new Scanner(System.in);
            int nome = nazCode.nextInt();
            System.out.println("Ordina 1:crescente o 2:decrescente?");
            Scanner ord = new Scanner(System.in);
            int ordInput = ord.nextInt();
            String tempOrd;
            if (ordInput == 1) {
                tempOrd = "ASC";
            } else {
                tempOrd = "DESC";
            }
            String query = "SELECT Code, CASE WHEN 0!=? THEN name else 'nome nascosto' end as Nome, Population FROM world.country where Population >= ? && Code like (?) Order by population "+tempOrd;
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1, nome);
            stm.setInt(2, popInput);
            stm.setString(3, codInput);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                String tableFormat = String.format("CODICE: %s NOME: %s POPULATION: %s",
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