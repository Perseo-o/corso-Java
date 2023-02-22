package cicli;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;
public class nonoPlus {

    static String myMethod3(String z){
        return "  "+z;
    }
    public static void main(String[] args) {
        /*ArrayList<String> cars =new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0,"Opel");
        System.out.println(cars);
        System.out.println(cars.get(0));*/
        ArrayList<String> nomi =new ArrayList<String>();
        ArrayList<String> password =new ArrayList<String>();
        ArrayList<Integer> eta =new ArrayList<Integer>();
        

        
        
        String scelta1, scelta2, exit="continua";
        Scanner sceltaP = new Scanner(System.in);
        Scanner inserD = new Scanner(System.in);
        int x=0;
            do{

                System.out.println("vuoi entrare nell'app? ");
                scelta1= sceltaP.nextLine();

                switch(scelta1){
                case "si":
                    System.out.println("vuoi entrare nell'app? ");
                    scelta2= sceltaP.nextLine();
                    switch(scelta2){
                    case "icrizione":
                        System.out.println("inserisci nome");
                        nomi.add(sceltaP.nextLine());
                        System.out.println("inserisci password");
                        password.add(sceltaP.nextLine());
                        System.out.println("inserisci eta");
                        eta.add(sceltaP.nextInt());
                        x ++;
                        
                        System.out.println("inserisci parola");
                        myMethod3(sceltaP.nextLine());
                        System.out.println(myMethod3(" "));
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
                break;
                default:
                    exit="uscita";
                break;
            }
                System.out.println(nomi.get(x));
                System.out.println(password.get(x));
                System.out.println(eta.get(x));
                
            }while(exit.equals("continua"));
        sceltaP.close();
        inserD.close();
    }
    
}

