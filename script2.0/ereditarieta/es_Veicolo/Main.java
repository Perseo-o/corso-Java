/*Definisci una classe "Veicolo" che contenga le seguenti proprietà:
Marca
Modello
Anno di fabbricazione
Definisci una sottoclasse "Auto" che estenda la classe "Veicolo" e che contenga le seguenti proprietà:
Numero di porte
Tipo di carburante
Consumo medio di carburante per 100 km
Definisci una sottoclasse "Moto" che estenda la classe "Veicolo" e che contenga le seguenti proprietà:
Cilindrata
Tipologia (sportiva, stradale, etc.)
Potenza
Per ogni classe, definisci il costruttore e i metodi getter e setter per ogni proprietà.

Nella classe "Main", crea almeno due oggetti di tipo "Auto" e due oggetti di tipo "Moto" con valori
 a tua scelta per le proprietà, e stampa le informazioni di ogni veicolo utilizzando i metodi getter. */
 package es_Veicolo;
 
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Veicolo> veicoli = new ArrayList<>();

        // Inserimento delle auto
        System.out.print("Inserisci il numero di auto che vuoi inserire: ");
        int numAuto = input.nextInt();

        for (int i = 0; i < numAuto; i++) {
            System.out.println("Inserisci i dati dell'auto " + (i + 1) + ":");
            System.out.print("Marca: ");
            String Marca = input.next();
            System.out.print("Modello: ");
            String Modello = input.next();
            System.out.print("Anno di fabbricazione: ");
            String AnnoFabbricazione = input.nextLine();
            System.out.print("Numero di porte: ");
            int NumeroPorte = input.nextInt();
            System.out.print("Tipo di carburante: ");
            String TipoCarburante = input.next();
            System.out.print("Consumo medio di carburante per 100 km: ");
            double ConsumoMedio = input.nextDouble();

            Auto auto = new Auto(Marca,  Modello,  AnnoFabbricazione,  NumeroPorte, TipoCarburante, ConsumoMedio);
            veicoli.add(auto);
        }

        // Inserimento delle moto
        System.out.print("Inserisci il numero di moto che vuoi inserire: ");
        int numMoto = input.nextInt();

        for (int i = 0; i < numMoto; i++) {
            System.out.println("Inserisci i dati della moto " + (i + 1) + ":");
            System.out.print("Marca: ");
            String Marca = input.next();
            System.out.print("Modello: ");
            String Modello = input.next();
            System.out.print("Anno di fabbricazione: ");
            String AnnoFabbricazione = input.nextLine();
            System.out.print("Cilindrata: ");
            int Cilindrata = input.nextInt();
            System.out.print("Tipologia (sportiva, stradale, etc.): ");
            String Tipologia = input.next();
            System.out.print("Potenza: ");
            int Potenza = input.nextInt();

            Moto moto = new Moto(Marca, Modello, AnnoFabbricazione, Cilindrata, Tipologia, Potenza);
            veicoli.add(moto);
        }

        // Ricerca veicolo
        System.out.println("\nInserisci le caratteristiche del veicolo che vuoi cercare:");
        System.out.print("Marca: ");
        String MarcaCercata = input.next();
        System.out.print("Modello: ");
        String ModelloCercato = input.next();
        System.out.print("Anno di fabbricazione: ");
        String AnnoFabbricazioneCercato = input.nextLine();

        boolean trovato = false;

        for (Veicolo veicolo : veicoli) {
            if (veicolo instanceof Auto) {
                Auto auto = (Auto) veicolo;
                if (auto.GetMarca().equals(MarcaCercata) &&
                        auto.GetModello().equals(ModelloCercato) &&
                        auto.GetAnnoFabbricazione().equals(AnnoFabbricazioneCercato) ) {
                    System.out.println("Auto trovata:");
                    System.out.println("Marca: " + auto.GetMarca());
                    System.out.println("Modello: " + auto.GetModello());
                    System.out.println("Anno di fabbricazione: " + auto.GetAnnoFabbricazione());
                    System.out.println("Numero di porte: " + auto.GetNumPorte());
                    System.out.println("Tipo di carburante: " + auto.GetTipoCarburante());
                    System.out.println("Consumo medio di carburante per 100 km: " + auto.GetConsumoMedio());
                    trovato = true;
                    break;
                }
            } else if (veicolo instanceof Moto) {
                Moto moto = (Moto) veicolo;
                if (moto.GetMarca().equals(MarcaCercata) &&
                        moto.GetModello().equals(ModelloCercato) &&
                        moto.GetAnnoFabbricazione() == AnnoFabbricazioneCercato) {
                    System.out.println("Moto trovata:");
                    System.out.println("Marca: " + moto.GetMarca());
                    System.out.println("Modello: " + moto.GetModello());
                    System.out.println("Anno di fabbricazione: " + moto.GetAnnoFabbricazione());
                    System.out.println("Cilindrata: " + moto.GetCilindrata());
                    System.out.println("Tipologia: " + moto.GetTipologia());
                    System.out.println("Potenza: " + moto.GetPotenza());
                    trovato = true;
                    break;
                }
            }
        }

        if (!trovato) {
            System.out.println("Nessun veicolo trovato con le caratteristiche inserite.");
        }
    }
}
    

