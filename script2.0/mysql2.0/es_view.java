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
            System.out.println("Inserire il numero di citt?? da inserire:");
            int sceltaNCitta = scanner.nextInt();
            if(sceltaNCitta>=10){
                System.out.println("numero di citt?? da inserire troppo grande numero massimo 10:");
                sceltaNCitta=10;
            }else{
                System.out.println("numero di citt?? da inserire accetato:");
            }
            int count = 0;
            while (count < sceltaNCitta) {
                count++;
                System.out.println("Inserisci il nome della citt??:");
                String nomeCitta = scanner.nextLine();

                // Scorri tutti i record della vista per verificare se la citt?? esiste gi??
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
                    System.out.println("La citt?? esiste gi?? nella vista.");
                } else {
                    // Chiedi all'utente di inserire le informazioni sulla citt??
                    System.out.println("Inserisci il country code della citt??:");
                    String countryCode = scanner.nextLine();
                    System.out.println("Inserisci il district della citt??:");
                    String district = scanner.nextLine();
                    System.out.println("Inserisci la popolazione della citt??:");
                    int popolazione = scanner.nextInt();

                    // Aggiungi la nuova citt?? alla vista
                    rs.moveToInsertRow();
                    rs.updateString("Name", nomeCitta);
                    rs.updateString("CountryCode", countryCode);
                    rs.updateString("District", district);
                    rs.updateInt("Population", popolazione);
                    rs.insertRow();
                    rs.moveToCurrentRow();
                    System.out.println("La citt?? ?? stata aggiunta alla vista.");
                }
            }
            conn.close();
            }

        
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}