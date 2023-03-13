
public class testArray {
    public static void main(String[] args) {
        int[] arrayProva = { 3, 5, 5, 8 }; // dichiara e inizializza array

        metodo(arrayProva); // invocazione metodo chiamato metodo che prende in input un array di interi
    }

    static void metodo(int[] arrayProva) { // dichiarazione metodo
        int n = 4; // dichiarazione variabile con numero di elementi dell'array
        for (int i = 0; i < n; i++) { // ciclo for per scorrimento array
            System.out.println("Ecco il numero: " + arrayProva[i]); // stampa elemento dell'array

        }
    }
}
