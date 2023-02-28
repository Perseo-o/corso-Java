package cicli;
import java.util.Scanner;
//import java.util.ArrayList;
public class macchina {

    static int motore(int cilindrata, int pistoni){
        Scanner primoValore = new Scanner(System.in);
        Scanner secondoValore = new Scanner(System.in);
        System.out.println("Inserire la cilindrata");
        cilindrata=primoValore.nextInt();
        System.out.println("Inserire la pistoni");
        pistoni=secondoValore.nextInt();
        primoValore.close();
        secondoValore.close();
        return motore(cilindrata, pistoni);
    }

    static int freni(int PotFren, int NumPastiglie){
        Scanner primoVa = new Scanner(System.in);
        Scanner secondoVa = new Scanner(System.in);
        System.out.println("Inserire azione frenante");
        PotFren=primoVa.nextInt();
        System.out.println("Inserire il numero di pastiglie");
        NumPastiglie=secondoVa.nextInt();
        primoVa.close();
        secondoVa.close();
        return freni(PotFren, NumPastiglie);
    }
    public static void main(String[] args) {
        AssMacchina(1,2);
        System.out.println("la targa è: ");

    }

    static int AssMacchina(int x, int y){
        motore(x, x);
        freni(y, y);
        return AssMacchina(x,y);
    }
}
