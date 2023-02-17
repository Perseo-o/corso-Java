import java.util.Scanner;

public class autenticazione {


        public static void main(String[] args) {
            
            Scanner name= new Scanner(System.in);
            String nome;
            //inserisce il nome
            System.out.println("Inserisci il nome: ");
            nome= name.nextLine();
            
            if(nome.equals("Giulio")){
            Scanner age = new Scanner(System.in);
            int eta;
            //inserisce l'età
            System.out.println("Inserisci l'età: ");
            eta= age.nextInt();
            age.close();
            if(eta>=18 || eta<=30){
            Scanner password = new Scanner(System.in);
            String pass;
            //inserisce il secondo numero
            System.out.println("Inserisci password: ");
            pass= password.nextLine();
            password.close();
            if(pass.equals("scoobydoo")){
                System.out.println("autenticazione avvenuta");
                
            }}}
            System.out.println("sei un impostore");
    
        name.close();
    }}