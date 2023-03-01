/*creare un sistema di inserimento che permetta di creare e salvare i daTI DI UN ACCOUNT
 ( nome cognome, età di tipo int obbligatoriamente, e data di nascita ) se i dati sono già presenti dovrà chiederti una 
password per modificarli in caso contrario te li farà inserirwe */

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

public class primo {
    public static void main(String[] args) {
       
       // ------------test jdbc-------------
            String url = "jdbc:mysql://localhost:3306/world";
            // driver li prende in automatico DriverManager
            // nome driver di MySql = "com.mysql.jdbc.Driver" ovveri il connectorJ

            try {

            Connection myConnection = null;
            myConnection = DriverManager.getConnection(url, "root", "root");

            if(myConnection == null)
            System.out.println("Non ho stabilito la connessione.");
            else
            System.out.println("Connessione avvenuta.");

            } catch (Exception e) {
            e.printStackTrace();
            }

            /*public class ricorsiva {
                static int num=0;
                public static void main(String[] args) {
                System.out.println(ricorsiva(8));
                }
                static int ricorsiva(int g){
                
                if(g==1){
                System.out.println("ciao");
                return g;
                }else{
                num=ricorsiva(g-1) + num;
                System.out.println("dad"+g);
                
                return num;
                
                }
                }
                }
                ---------------------------------------------------------------------------------
                static int StampaRic(int n,int numeroP,int numeroS){

                if(numeroP==0){
                System.out.println("0\n1\n1");
                return StampaRic(n-3,1,2);
                }
                int numeroN=numeroP+numeroS;
                System.out.println(numeroN);
                if(n>2){
                return StampaRic(n-1,numeroS,numeroN);
                }
                return numeroN;
                }*/




















































































        //____________________________________________________________________________________________________
            int i=0, nF1=0, nF2=1, nFS;
            Scanner inserimentoDati = new Scanner(System.in);
            System.out.println("inserisci a che numero di fibonacci vuoi arrivare");
            int y= inserimentoDati.nextInt();
            System.out.println("I numeri di fibonacci sono: ");
            while(y>=0){
                nFS=nF1;
                nF1=nF2;
                nF2=nFS;
                nF1=nF1+nF2;
                y--;
                if(nF1%2==0){
                    System.out.println(nF1+" ");
                }
            }
            i=i+5;
        inserimentoDati.close();
    }
}
