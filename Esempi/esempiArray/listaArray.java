package Esempi.esempiArray;

import java.util.ArrayList; //importa libreria ArrayList
import java.util.Arrays; //importa libreria Arrays

public class listaArray {
    public static void main(String[] args) {

        Integer arr[] = { 1, 2, 3, 4, 5, 6 }; // dichiara e inizializza array di interi
        System.out.println("Array:" + Arrays.toString(arr)); // stampa tutto l'array tramite metodo toString
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr)); // crea oggetto ArrayList utilizzato
                                                                                   // per aggiunta valori dentro array
        arrayList.add(7); // aggiungi elemento all'arrayList
        arr = arrayList.toArray(arr); // converte l'arrayList in array e la assegna all'array arr
        System.out.println("Array after adding element: " + Arrays.toString(arr)); // stampa nuovamente tutto l'array

    }

}