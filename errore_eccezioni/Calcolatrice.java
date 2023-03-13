package errore_eccezioni;

public class Calcolatrice {
    static void somma(int x, int y){
        try{
        System.out.println(x+y);
        } catch(Exception e){
            System.out.println("Valori non validi : /");
        }
    }

    static void sottrazione(int x, int y){
        try{
        System.out.println(x-y);
        } catch(Exception e){
            System.out.println("Valori non validi : /");
        }
    }

    static void moltiplicazione(int x, int y){
        try{
        System.out.println(x*y);
        } catch(Exception e){
            System.out.println("Valori non validi : /");
        }
    }

    static void divisione(int x, int y){
        try{
        System.out.println(x/y);
        } catch(Exception e){
            System.out.println("Valori non validi : /");
        }
    }

}
