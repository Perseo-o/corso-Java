package cicli;
//import java.util.Scanner;
/*Create un ciclo che permetta di scegliere un numero
 da 1 a 10 e che lo divida per 2 o modulo in base a se è pari o dispari*/

public class cicloInizi {
    public static void main(String[] args) {
       
         /*do{
            Scanner scelta1 = new Scanner(System.in);
            System.out.println("Scegli un numero da 1 a 10");
            int x= scelta1.nextInt();
            if(x<1 || x>10){
                if((x%2)==0)
                    System.out.println("il numero è pari e diviso 2 è:" +(x/2));
                else
                    System.out.println("il numero è dispari il modulo è:" +(x%2));
                    
            }
            Scanner uscita = new Scanner(System.in);
            System.out.println("Scegli 1 per avere l'iniziale della parola/frase, 2 per la lettera finale della parola/frase ");
            int ex= scelta1.nextInt();
        }while(ex>=1);*/
        int i=0;
        do{
            System.out.println("Scegli 1 per avere l'iniziale della parola/frase, 2 per la lettera finale della parola/frase ");
            i++;
            int x=0;
            do{
                System.out.println("Scegli 1 per avere l'iniziale della parola/frase, 2 per la lettera finale della parola/frase ");
                x++;
            }while(x<5);
        }while(i<5);
    }
    
}