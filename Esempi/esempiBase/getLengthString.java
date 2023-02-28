package Esempi.esempiBase;

public class getLengthString {
    public static void main(String[] args) {
        String stringa = "Ciao a tutti"; // dichiara e inizializza stringa
        int length; // variabile lenght intera
        length = GetStringLenght(stringa); // assegna a length la lunghezza della stringa con il metodo GetStringLenght
        System.out.println("La lunghezza della stringa è:" + length); // stampa lunghezza stringa

    }

    static int GetStringLenght(String stringInseritaString) { // dichiarazione metodo GetStringLenght
        return stringInseritaString.length(); // restituzione lunghezza della stringa ricevuta in input
    }
}