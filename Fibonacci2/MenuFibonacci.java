package Fibonacci2;

import java.util.Scanner;

public class MenuFibonacci {
    private Scanner sc = new Scanner(System.in);

    public void menu() {

        boolean continua = true;

        do {
            // System.out.println("Prego inserisca una scelta\n [1]Genera Fibonacci\n
            // [2]Genera Fibonacci solo per dispari\n [3]Trova in Fibonacci\n [4]Esci\n");
            int sc = inputSelezione("Prego inserisca una scelta\n [1]Genera Fibonacci\n [2]Genera Fibonacci solo per dispari\n [3]Trova in Fibonacci\n [4]Esci\n");

            switch (sc) {

                case 1:
                    FibonacciOperation.FibonacciGenerator();
                    break;
                case 2:
                    FibonacciOperation.FibonacciGeneratorEvenNumber();
                    break;
                case 3:
                    // FibonacciFinderNmr();
                    FibonacciOperation.FinderFibonacci();
                    break;
                case 4:
                    System.out.println("Arrivederci!");
                    continua = false;
                    return;

                default:
                    System.out.println("ERRORE! SELEZIONARE UN VALORE VALIDO");
            }
        } while (continua != false);
    }

    public int inputSelezione(String inputMessage) {
        System.out.println(inputMessage);
        int num = sc.nextInt();
        sc.nextLine(); // consuma il carattere di fine linea lasciato dal metodo nextInt()
        return num;
    }

    
}