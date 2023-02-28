package Esempi.esempiBase;

import java.util.Scanner; // importa libreria Scanner

class scanner {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // crea oggetto scanner

    System.out.println("Enter username"); // richiesta inserimento utente
    String userName = myObj.nextLine(); // input inserimento utente

    System.out.println("Username is: " + userName); // stampa il nome utente
    myObj.close(); // chiudi scanner myObj
  }
}