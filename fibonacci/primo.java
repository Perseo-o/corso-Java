/*creare un sistema di inserimento che permetta di creare e salvare i daTI DI UN ACCOUNT
 ( nome cognome, età di tipo int obbligatoriamente, e data di nascita ) se i dati sono già presenti dovrà chiederti una 
password per modificarli in caso contrario te li farà inserirwe */
package fibonacci;
import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
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
        inserimentoDati.close();
    }
}
