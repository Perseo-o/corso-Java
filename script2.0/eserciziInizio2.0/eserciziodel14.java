/*Creare un sistema di inserimento che prenda tre dati in fila, un numero, una string e che setti un bool

Dopo di che un menu dovrà farci scegliere tra tre opzioni

Funzioni matematiche, Funzioni Stringa, Casting

Funzioni matematiche: Sul numero che abbiamo eseguiremo un operazione a scelta fra 4 disponibili e vedremo il risultato
Funzioni String: Devono eseguire un sub string o un concatenamento a scelta
Casting trasforma un dato da un tipo ad un 'altro e valorizza il risultato a schermo*/
import java.util.Scanner;

//import javax.lang.model.util.ElementScanner6;

public class eserciziodel14 {  
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        Scanner stringa = new Scanner(System.in);
        Scanner bool = new Scanner(System.in);
        int num;
        String fra;
        boolean buu;
        System.out.println("Inserire rispettivamente/nUnnumero,una stringa, un bool ");
        num= numero.nextInt();
        fra= stringa.nextLine();
        buu= bool.nextBoolean();

        Scanner scelta1 = new Scanner(System.in);
        int primaScelta;
        System.out.println("Scegli 1 per funzioni matematiche, 2 per funzioni Stringa, 3 per casting: ");
        primaScelta= scelta1.nextInt();
        switch (primaScelta){
            case 1:

            Scanner scelta2 = new Scanner(System.in);
            int secondaScelta;
            System.out.println("Scegli 1 per radice quadrata, 2 per cubo, 3 per ...: ");
            secondaScelta= scelta2.nextInt();

            switch (secondaScelta){
                case 1:

                System.out.println("La radice quadrata di "+num+" è: "+ Math.sqrt(num));

                break;
                case 2:

                System.out.println("Il cubo di "+num+" è: ");
                break;
                case 3:
                if(num%2==0)
                    System.out.println("Il numero "+num+" è pari");
                else
                    System.out.println("Il numero "+num+" è dispari");
                break;
            }

            break;
            case 2:
            Scanner scelta3 = new Scanner(System.in);
            int terzaScelta;
            System.out.println("Scegli 1 per avere l'iniziale della parola/frase, 2 per la lettera finale della parola/frase ");
            terzaScelta= scelta3.nextInt();

            switch (terzaScelta){
                case 1:

                System.out.println("L'iniziale è: "+ fra.substring(0,1));

                break;
                case 2:

                System.out.println("L'iniziale è: "+ fra.substring(1,1));
                break;
                case 3:
                System.out.println("Wedsney");
                break;
                }
                System.out.println(buu);
        }
        numero.close();
        stringa.close();
        bool.close();
        scelta1.close();
    }
}

