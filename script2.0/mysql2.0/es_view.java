import java.sql.*;
import java.util.*;

public class es_view {

    public static void main (String [] args)
    {
        //-----------------------------TEST JDBC-----------------------------
        String url = "jdbc:mysql://localhost:3306/world";
        //Driver li prende in automatico DriverManager
        //String driver = "com.mysql.jdbc.Driver";      //nome del driver di MySql ovvero il connector

        //Dichiaro la connessione
        //Connection myConnection = null;    
        //Si potrebbe utilizzare anche questo sotto ma meglio farlo in un try catch 
        //DriverManager.getConnection(url, user:"root", password:"root");
        Scanner scanner = new Scanner(System.in);
        Scanner risposta = new Scanner(System.in);
        try
        {
            Connection myConnection = null;
            myConnection = DriverManager.getConnection(url, "root", "3469587");

            if(myConnection == null)
            {
                System.out.println("Connessione non stabilita");
            }
            else
            {
                System.out.println("Connessione avvenuta con successo");
            }
            //Prova query in db world
            String query = "SELECT * FROM world.cosi;";
            Statement Stm = myConnection.createStatement();
            ResultSet rs = Stm.executeQuery(query);

            ResultSetMetaData rsmd =rs.getMetaData();
            int numColumns=rsmd.getColumnCount();
            while(rs.next())
            {
                for(int i=1;i<=numColumns;i++){
                    Object value=rs.getObject(i);
                    String columnName=rsmd.getColumnName(i);
                    String columnType=rsmd.getColumnName(i);
                    System.out.println(columnName+" | "+ columnType+" | "+ value);
                }

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        try
        {
             // Stabilisce la connessione al database
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world", "root", "3469587");

            // Crea uno statement per recuperare la vista
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "SELECT * FROM city";
            ResultSet rs = stmt.executeQuery(query);

            // Recupera i metadati dalla vista
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rsmd.getColumnCount();

            // Chiedi all'utente di inserire la città da aggiungere massimo 10 volte
            int count = 0;
            while (count < 10) {
                // Chiedi all'utente di inserire il nome della città da aggiungere
                System.out.println("Inserisci il nome della città:");
                String nomeCitta = scanner.nextLine();

                // Scorri tutti i record della vista per verificare se la città esiste già
                boolean cittaEsiste = false;
                rs.beforeFirst();
                while (rs.next()) {
                    String nomeCittaVista = rs.getString("Name");
                    if (nomeCittaVista.equalsIgnoreCase(nomeCitta)) {
                        cittaEsiste = true;
                        break;
                    }
                }

                if (cittaEsiste) {
                    System.out.println("La città esiste già nella vista.");
                } else {
                    // Chiedi all'utente di inserire le informazioni sulla città
                    System.out.println("Inserisci il country code della città:");
                    String countryCode = scanner.nextLine();
                    System.out.println("Inserisci il district della città:");
                    String district = scanner.nextLine();
                    System.out.println("Inserisci la popolazione della città:");
                    int popolazione = scanner.nextInt();

                    // Aggiungi la nuova città alla vista
                    rs.moveToInsertRow();
                    rs.updateString("Name", nomeCitta);
                    rs.updateString("CountryCode", countryCode);
                    rs.updateString("District", district);
                    rs.updateInt("Population", popolazione);
                    rs.insertRow();
                    rs.moveToCurrentRow();
                    System.out.println("La città è stata aggiunta alla vista.");
                } // Chiedi all'utente se vuole aggiungere un'altra città
                System.out.println("Vuoi inserire un'altra città? (s/n)");
                String risposta2 = risposta.nextLine().toLowerCase();
                if (!risposta2.equals("s")) {
                    break;
                }
                count++;
            }

            // Chiudi la connessione al database
            conn.close();
            }

        
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}