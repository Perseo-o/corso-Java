import java.util.Scanner;
public class Registratore {
    
   public static void main(String[] args) {
    Scanner dati = new Scanner(System.in);
    int Profondita1=0, f=0,c=0,a=0,r=0;
    Registratore Animale=new Registratore();
    do{
        System.out.println("Inserisci nome dell'animale");
        String nome=dati.nextLine();
        System.out.println("Inserisci nome del tipo di animale");
        String name=dati.nextLine();
        System.out.println("Inserisci regno animale tra Felini, Canidi, Anfibi, Roditori");
        Profondita1=dati.nextInt();
        switch(Profondita1){
            case 1:
            Animale.SetFelino(nome,name);
            f++;
            break;
            case 2:
            Animale.SetCanide(nome,name);
            c++;
            break;
            case 3:
            Animale.SetAnfibio(nome,name);
            a++;
            break;
            case 4:
            Animale.SetRoditore(nome,name);
            r++;
            break;
            default:
            System.out.println("Scelta errata");
            break;
        }
    }while(qualcosa==true);
    
    System.out.println("Il numero di felini registrati sono: "+f);
    

   }
}
