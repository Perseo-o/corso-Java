package cicli;
import java.util.Scanner;
import java.util.ArrayList;

public class esercizio2_22 {
    
    
    static ArrayList<String> nome =new ArrayList<String>();
    static ArrayList<String> password1 =new ArrayList<String>();
    static ArrayList<String> password2 =new ArrayList<String>();
    
    static int numeroPersone=0, numeroPassword=4;
    public static void main(String[] args) {
        password1.add(0,"arbc");
        password1.add(1,"qrgt");
        password1.add(2,"pppp");
        password1.add(3,"qqqq");
        password1.add(0,"abcde");
        // int, duoble, string, bool
        // e far sin che in base alla scelta in input stampi
        // col METODO TIPIZZATO GIUSTO
        Scanner dati= new Scanner(System.in);
        Scanner scelta= new Scanner(System.in);
        int uscita = 0;
       int arrori=0;
       do {
        System.out.println("Scegli un opzione, 0 registrazione, 1 login, 2 exit");
        arrori = scelta.nextInt();
        switch (arrori) {
            case 0:
                Scanner nuovo = new Scanner(System.in);
                System.out.println("Digitare nome nuovo piatto: ");
                nome.add(numeroPersone,nuovo.nextLine());
                numeroPersone++;
            break;
            case 1:
                System.out.println("Inserisci nome");
                String nomeIn = dati.nextLine();
                LoginPersona(nomeIn);
                System.out.println("Inserisci prima password");
                String password1In = dati.nextLine();
                LoginPersona(nomeIn, password1In);
                System.out.println("Inserisci seconda password");
                String password2In = dati.nextLine();
                LoginPersona(nomeIn, password1In,password2In);
            break;
            case 2:
                uscita=5;
            break;
        }
       } while (uscita==0);
    }


    static void LoginPersona(String n) {
        for(int i=0;i<numeroPersone;i++)
        if(n.equals(nome.get(i))){
            System.out.println("Sei stato loggato con successo");
        }
    }

    static void  LoginPersona(String n,String p1) {
        for(int i=0;i<numeroPersone;i++)
        if(n.equals(nome.get(i))){
            System.out.println("Sei stato loggato con successo");
        }
        for(int i=0;i<4;i++)
        if(p1.equals(password1.get(i))){
            System.out.println("ora sei uno sviluppatore");
        }
    }

    static void  LoginPersona(String n,String p1, String p2) {
        for(int i=0;i<numeroPersone;i++)
        if(n.equals(nome.get(i))){
            System.out.println("Sei stato loggato con successo");
        }
        
        for(int i=0;i<4;i++)
        if(p1.equals(password1.get(i))){
            System.out.println("ora sei uno sviluppatore");
        }
        if(p2.equals(password2.get(0))){
            System.out.println("ora sei il capo");
        }
    }

     
}
