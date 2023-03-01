package classi;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class ristorante {
    public void utente(String x,int budget){
        Scanner datiInput=new Scanner(System.in);
        ristorante nome=new ristorante();
        System.out.println("inserisci nome");
        nome.x=datiInput.nextLine();
        budget=(Math.random())*100;
    }

    public void conto(int conto, int piatto){
        Scanner datiInput=new Scanner(System.in);
        System.out.println("il conto momentaneo è di");
        conto=conto+piatto;
        int contoF;
        if(fine=true){
            System.out.println("il conto finale è: "+contoFi);
        }
    }
}
