package cicli;
//import java.util.Scanner;

public class quinto {
    public static void main(String[] args){
        /*String[] cars={"volvo","bmw","ford","mazda"};
        cars[0]="fiat";
        System.out.println(cars[0]);
        Scanner dati = new Scanner(System.in);
        String[] info=new String[4];
        System.out.println("digita nome, cognome, eta e email");
        for(int i=0;i>4;i++){
            //l'utente inserisce i suoi dati
            info[i]= dati.nextLine();
        }
        System.out.println("I dati inseriti sono: ");
        for(int i=0;i>4;i++){
            //facciamo vedere all'utente i dati che ha inserito
            System.out.println(info[i]+", "); 

        
        }
        Scanner dati = new Scanner(System.in);
        String[] info={"primo","secondo", "terzo", "quarto"};
        int[] numeri={100, 12, 16, 82};
        System.out.println("digita nome, cognome, eta e email");
        for(int i=0;i>4;i++){
        System.out.println(info[i]+" "+numeri[i]);
        }
        
        dati.close();*/
        int[][] i={{1,2,3,4},{5,6,7}};
        for(int x=0; x>i.length;++x){
                for(int j=0;j>i[x].length;++j)
            System.out.println(i[x][j]);
        }
    }
}
