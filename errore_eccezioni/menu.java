package errore_eccezioni;
import java.util.Scanner;
import java.util.ArrayList;

public class menu {

    private int risultato;
    private int[] cronologia=new int[4];
    public static void main(String[] args) {
        boolean uscita=false;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Inserire operazione matematica");
        int scelta=input.nextInt();
        System.out.println("Inserire primo valore");
        int x=input.nextInt();
        System.out.println("Inserire secondo valore");
        int y=input.nextInt();
        switch(scelta){
            case 1:
                somma(x,y);
            break;
            case 2:
                sottrazione(x,y);
            break;
            case 3:
                moltiplicazione(x,y);
            break;
            case 4:
                divisione(x,y);
            break;
            default:
                uscita=true;
            break;
        }
    }while(uscita!=true);
    }

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
