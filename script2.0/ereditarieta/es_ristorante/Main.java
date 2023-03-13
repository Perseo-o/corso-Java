/*Andiamo a creare una classe MENU
 che può creare vari oggetti che sono definiti come piatti con tre ARGOMENTI l'uno 
 ( Ingredienti, Prezzo, Chef )Andiamo a creare una classe ORDINAZIONE che può diventare qualsiasi tipo di piatto,
  ma con la sola caratteristica del prezzo del piatto per creare un calcolo unitario del totale 
  che possa essere richiamato dalla classe ORDINAZIONE */
package es_ristorante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner interi = new Scanner(System.in);
    public static Scanner stringhe = new Scanner(System.in);

    public static void main(String[] args) {
        Menu myMenu = new Menu();
        Piatto p = new Piatto("Bolognese", "Pancetta", "Cheff Pippo", 15);
        Piatto p1 = new Piatto("Spaghetti", "Cacio e pepe", "Cheff Massimo", 12);
        Piatto p2 = new Piatto("Gnocchi", "Pomodoro e basilico", "Cheff Francesco", 14);
        Piatto p3 = new Piatto("Ravioli", "Branzino", "Cheff Antonio", 13);
        myMenu.aggiungiPiatto(p);
        myMenu.aggiungiPiatto(p1);
        myMenu.aggiungiPiatto(p2);
        myMenu.aggiungiPiatto(p3);
        // myMenu.stampaMenu();
        boolean uscita = false;

        while (!uscita) {
            System.out.println("Vuoi ordinare o uscire?");
            int scelta = interi.nextInt();
            if (scelta == 1) {
                myMenu.stampaMenu();
                System.out.println("Quale piatto vuoi ordinare?");
                int sceltaPiatto = interi.nextInt();
                if (sceltaPiatto <= 4) {
                    Ordinazione myOrd = new Ordinazione(myMenu.getPiatto(sceltaPiatto - 1).getPrezzo());
                    Ordinazione.setIncassoTotale(myOrd.getPrezzo());
                    System.out.println("Piatto ordinato");
                } else {
                    System.out.println("ERRORE");
                }
            } else {
                uscita = true;
            }
        }

        System.out.println("Incasso di oggi: " + Ordinazione.getIncassoTotale());
    }

}
