package Esempi.esempiBase;

import java.lang.Math; //importo classe Math dalla libreria

public class math { // classe math
    public static void main(String[] args) { // main

        int x = (int) (Math.random() * 101); // numero x random tra 0 e 100
        int y = (int) (Math.random() * 101); // numero y random tra 0 e 100
        double z = (int) (Math.random() * 101); // numero z random tra 0 e 100

        int max = Math.max(x, y); // trova numero massimo tra x e y
        int min = Math.min(x, y); // trova numero minimo tra x e y
        double quadrato = Math.sqrt(z); // trova quadrato di z

        int randomNumber = (int) (Math.random() * 1501); // numero random tra 0 e 1500

        System.out.println("Il massimo tra " + x + " e " + y + " è " + max); // stampa numero massimo
        System.out.println("Il minimo tra " + x + " e " + y + " è " + min); // stampa numero minimo
        System.out.println("Il quadrato di " + z + " è " + quadrato); // stampa quadrato del numero
        System.out.println("Il numero random generato tra 0 e 1501 è " + randomNumber); // stampa numero random
    }

}
