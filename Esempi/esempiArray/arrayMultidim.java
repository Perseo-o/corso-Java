package Esempi.esempiArray;

public class arrayMultidim {
    public static void main(String[] args) {
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } }; // Array multidimensionale
        System.out.println(myNumbers[0][2]); // stampa il numero in posizione 2 dell'array in posizione 0 - in questo
                                             // caso 3
        System.out.println("---------------------------------------------------");

        /*
         * Questo doppio ciclo viene usato per la
         * visualizzazione dell'array su 2 indici
         */

        for (int i = 0; i < myNumbers.length; i++) { // ciclo per scorrimento array indice i
            for (int j = 0; j < myNumbers[i].length; j++) { // ciclo per scorrimento array indice j
                System.out.println(myNumbers[i][j]); // stampa array
            }
        }

    }
}