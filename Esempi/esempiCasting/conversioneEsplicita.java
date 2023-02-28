package Esempi.esempiCasting;

public class conversioneEsplicita {
    public static void main(String[] args) {
        float d = (float) 10.85; // dichiarazione e inizializzazione variabile float
        System.out.println(d); // stampa variabile float
        d = arrotonda(d); // arrotonda variabile d con metodo arrotonda
        System.out.println(d); // stampa variabile float dopo arrotondamento

    }

    static int arrotonda(float value) { // dichiarazione metodo
        return (int) (value + 0.5); // restituisce valore convertito in int e arrotondato
    }
}