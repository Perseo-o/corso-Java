/*creare un sistema di inserimento che permetta di creare e salvare i daTI DI UN ACCOUNT
 ( nome cognome, età di tipo int obbligatoriamente, e data di nascita ) se i dati sono già presenti dovrà chiederti una 
password per modificarli in caso contrario te li farà inserirwe */
package cicli;
import java.util.Scanner;

public class cosa {
    public static void main(String[] args) {
       
            Scanner inserimentoDati = new Scanner(System.in);
            System.out.println("digita 1 per il login 2 per la registrazione");
            int y= inserimentoDati.nextInt();
            if(y==1){
        int i=0;
        do{
            System.out.println("inserisci nome cognome età e data ");
            System.out.println("Scegli un numero da 1 a 10");
            String nome= inserimentoDati.nextLine();
            System.out.println("Scegli un numero da 1 a 10");
            String cognome= inserimentoDati.nextLine();
            System.out.println("Scegli un numero da 1 a 10");
            int eta= inserimentoDati.nextInt();
            System.out.println("Scegli un numero da 1 a 10");
            String data= inserimentoDati.nextLine();
            
            if(nome.equals("")){
                if(cognome.equals("")){
                    if(data.equals("")){
                        if(eta==18){
                            
                            System.out.println("inserire password");
                            String password= inserimentoDati.nextLine();
                            if(password.equals("")){
                            
                                System.out.println("login effettuato");
                                
                            }else
                            System.out.println("password errata");
                        }else
                        System.out.println("il login è andatomale");
                    
                    }else
                    System.out.println("il login è andatomale");
                
                }else
                System.out.println("il login è andatomale");
            
            }else
                System.out.println("il login è andatomale");
            
        }while(i<5);
        }if(y==2){


        
        }else{
            inserimentoDati.close();
        }
    }
}