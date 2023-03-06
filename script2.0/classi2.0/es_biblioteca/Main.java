/*Obiettivo: Scrivere una classe Java che rappresenti una biblioteca.

Dobbiamo creare una classe chiamata "Biblioteca" che contenga le seguenti proprietà:

Un elenco di libri disponibili nella biblioteca (consigliato l'uso di un array o di una collezione di oggetti "Libro").
Il numero di copie disponibili per ogni libro.
Il numero di copie attualmente in prestito.
La classe Biblioteca dovrebbe avere i seguenti metodi:

"prestaLibro": questo metodo deve prenotare una copia del libro specificato dall'utente, riducendo il numero di copie
 disponibili e aumentando il numero di copie in prestito. Se non ci sono copie disponibili,
  deve restituire un messaggio di errore.
"restituisciLibro": questo metodo deve restituire una copia del libro specificato dall'utente, aumentando il numero di 
copie disponibili e riducendo il numero di copie in prestito. Se l'utente tenta di restituire una copia che non è stata 
presa in prestito, deve restituire un messaggio di errore.
"aggiungiLibro": questo metodo deve aggiungere un nuovo libro all'elenco dei libri disponibili nella biblioteca,
 con il numero di copie specificato dall'utente.
"rimuoviLibro": questo metodo deve rimuovere un libro dall'elenco dei libri disponibili nella biblioteca.
Inoltre, la classe Biblioteca dovrebbe avere un metodo "stampaLibriDisponibili" che stampa l'elenco dei libri 
disponibili nella biblioteca, con il numero di copie disponibili per ogni libro.

Infine, creare una classe "Main" che istanzia la classe Biblioteca
-------------------------------------------------------------------------------
Creare una classe utente e una admin l'utrente da i suoi dati e poi puoi usare biblioteca,
 l'admin dopo aver dato i suoi dati + 1 di controllo ( a scelta vostra) può modificare ed eliminare gli utenti 
 e usare biblioteca */
 package es_biblioteca;

 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.UUID;
 
 public class Main {
     private static ArrayList<utente> utentiRegistrati = new ArrayList<>();
     private static ArrayList<Admin> adminRegistrati = new ArrayList<>();
     private static Scanner input = new Scanner(System.in);
     private static Scanner inp = new Scanner(System.in);
     private static Scanner codice = new Scanner(System.in);
     private static int contaAdmin = 0;
 
     public static void main(String[] args) {
         boolean continua = true;
         do {
             System.out.println("Scegli un'opzione:");
             System.out.println("1. Registrati");
             System.out.println("2. Accedi");
             System.out.println("3. Esci");
             int scelta = input.nextInt();
             input.nextLine(); // Consuma il carattere di fine linea rimasto nel buffer di input
 
             switch (scelta) {
                 case 1:
                     registrati();
                     break;
                 case 2:
                     accedi();
                     break;
                 case 3:
                     continua = false;
                     break;
                 default:
                     System.out.println("Scelta non valida");
                     break;
             }
         } while (continua);
     }
 
     private static void registrati() {
         System.out.println("Vuoi registrarti come utente o admin? \n [1]ADMIN\n [2]UTENTE\n");
         int sc = inp.nextInt();
         while (contaAdmin<2){
 
             if(sc == 2){
                 System.out.print("Inserisci il nome utente: ");
                 String nomeUtente = input.nextLine();
                 if (utenteEsiste(nomeUtente)) {
                     System.out.println("Il nome utente è già stato preso");
                     return;
                 }
                 System.out.print("Inserisci la password: ");
                 String password = input.nextLine();
                 utente nuovoUtente = new utente(nomeUtente, password);
                 utentiRegistrati.add(nuovoUtente);
                 System.out.println("Registrazione avvenuta con successo");
             }else{
                 System.out.print("Inserisci il nome utente dell'admin: ");
                 String nomeAdmin = input.nextLine();
                 if (adminEsiste(nomeAdmin)) {
                     System.out.println("Il nome utente dell'admin è già stato preso");
                     return;
                 }
                 System.out.print("Inserisci la password: ");
                 String password = input.nextLine();
                 
                 UUID id = Admin.getId();
                 System.out.print("Inserisci il codice di accesso: ");
                 String codice = input.nextLine();
                 Admin nuovoAdmin = new Admin(nomeAdmin, password, id, codice);
                 adminRegistrati.add(nuovoAdmin);
                 System.out.println("Registrazione avvenuta con successo");
                 contaAdmin++;
             }
 
         }
 
 
     }
 
     private static void accedi() {
         System.out.println("Vuoi eseguire il login come utente o admin? \n [1]ADMIN\n [2]UTENTE\n");
         int sc = inp.nextInt();
         if(sc==2){
             System.out.print("Inserisci il nome utente: ");
             String nomeUtente = input.nextLine();
             utente utente = getUtente(nomeUtente);
             if (utente == null) {
                 System.out.println("Utente non trovato");
                 return;
             }
             System.out.print("Inserisci la password: ");
             String password = input.nextLine();
             
             if (utente.verificaPassword(password)) {
                 System.out.println("Accesso effettuato con successo");
                 
                 // Aggiungo qui il codice per il menu dell'utente loggato
             } else {
                 System.out.println("Password errata");
             }
         }else{
             System.out.print("Inserisci il nome utente dell'admin: ");
             String nomeAdmin = input.nextLine();
             Admin admin = getAdmin(nomeAdmin);
             if (admin == null) {
                 System.out.println("Admin non trovato");
                 return;
             }
             System.out.print("Inserisci la password: ");
             String password = input.nextLine();
 
             System.out.print("Inserisci il codice di accesso: ");
             String code = codice.nextLine();
             
             if (admin.verificaCodiceAccesso(code)) {
                 if(admin.verificaPassword(password)){
 
                     System.out.println("Accesso effettuato con successo");
                     System.out.println("Sei QUI, DEVI CONTINUARE !!!!!!!!!!!!!!!");
                     // Aggiungo qui il codice per il menu dell'admin loggato
                 }else System.out.println("Codice errato");
             }else System.out.println("Password errata");
         }
     }
 
     private static boolean utenteEsiste(String nomeUtente) {
         
         return false;
     }
 
     private static boolean adminEsiste(String nomeAdmin) {
         for (Admin admin : adminRegistrati) {
             if (admin.getNome().equals(nomeAdmin)) {
                 return true;
             }
         }
         return false;
     }
 
     
     private static Admin getAdmin(String nomeAdmin) {
         for (Admin admin : adminRegistrati) {
             if (admin.getNome().equals(nomeAdmin)) {
                 return admin;
             }
         }
         return null;
     }
     }