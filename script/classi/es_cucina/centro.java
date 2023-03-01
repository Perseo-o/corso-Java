/*Creare un sistema di inserimento che crei una classe utente di 3 diversi tipi, chef , chef capo, e magazziniere
 che devono avere la stessa classe d'origine ovvero utente ma carrateristiche diverse in base ai parametri */
package classi.es_cucina;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class centro {
    

    public static void main(String[] args) {
        
        ArrayList<String> nomi =new ArrayList<String>();
        ArrayList<String> password =new ArrayList<String>();
        ArrayList<Integer> eta =new ArrayList<Integer>();
    
        String scelta2;
        Scanner sceltaP = new Scanner(System.in);
        Scanner inserD = new Scanner(System.in);
        int x=0;
        
        System.out.println("cosa vuoi fare");
        scelta2= sceltaP.nextLine();
        switch(scelta2){
        case "iscrizione":
            System.out.println("inserisci nome");
            nomi.add(sceltaP.nextLine());
            System.out.println("inserisci password");
            password.add(sceltaP.nextLine());
            System.out.println("inserisci eta");
            eta.add(sceltaP.nextInt());
            x ++;
                        
                        
        break;
        case "modifica":
            System.out.println("inserisci nome ");
            String loginN= inserD.nextLine();
            System.out.println("inserisci password ");
            String loginP= inserD.nextLine();
            for(int i=0;i<x;i++){
                if(loginN.equals(nomi.get(i))&& loginP.equals(password.get(i))){
                                
                    System.out.println("login effettuato ");
                    System.out.println("immettere nuova password ");
                    password.set(i,sceltaP.nextLine());
                    System.out.println("immettere nuovo nome ");
                    nomi.set(i,sceltaP.nextLine());
                                
                }else{
                    System.out.println("qualcosa è andato storto ");
                                
                }
            }
            break;
            case "cancella":
                System.out.println("inserisci nome ");
                loginN= inserD.nextLine();
                System.out.println("inserisci password ");
                loginP= inserD.nextLine();
                for(int i=0;i<x;i++){
                    if(loginN.equals(nomi.get(i))&& loginP.equals(password.get(i))){
                            
                        System.out.println("login effettuato ");
                        nomi.remove(i);
                        password.remove(i);
                        eta.remove(i);
                    }else{
                        System.out.println("qualcosa è andato storto ");
                            
                    }
                }
            break;
            default:
                System.out.println("qualcosa è andato storto ");
            break;
            }
            
            System.out.println(nomi.get(x));
            System.out.println(password.get(x));
            System.out.println(eta.get(x));
            
        sceltaP.close();
        inserD.close();
    }
    
}

