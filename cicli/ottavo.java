package cicli;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ottavo {
    public static void main(String[] args) {
       
        Integer numeri[] = {1,2,3,4,5,6,0};
        String[] stringhe= {"a","b","c","d","e","f","g"};
        String scelta1, scelta2, scelta3, exit="continua";
        Scanner sceltaP = new Scanner(System.in);
        Scanner sceltaS = new Scanner(System.in);
        Scanner sceltaCambio = new Scanner(System.in);

            do{

            System.out.println("vuoi entrare nell'app? ");
            scelta1= sceltaP.nextLine();

            if(scelta1.equals("si")){

                System.out.println("vuoi vedere stringhe o numeri");
                scelta2= sceltaP.nextLine();
                if(scelta2.equals("stringhe")){

                    System.out.println("Le stringhe sono");

                    for(int x=0;x<stringhe.length;++x){
                        System.out.println(stringhe[x]); 
                    }

                    System.out.println("vuoi cambiare l'ultima l'ettera? ");
                    scelta3= sceltaCambio.nextLine();

                    if(scelta3.equals("si")){
                        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringhe));
                        System.out.println("immetti lettera: ");
                        arrayList.add(sceltaCambio.nextLine());
                        stringhe = arrayList.toArray(stringhe);
                    }

                }else if(scelta2.equals("numeri")){                    
                        System.out.println("i numeri sono");

                    for(int x=0;x<numeri.length;++x){
                        System.out.println(numeri[x]); 
                    }

                    System.out.println("vuoi cambiare l'ultimo numero? ");
                    scelta3= sceltaCambio.nextLine();

                    if(scelta3.equals("si")){
                        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(numeri));
                        System.out.println("immetti lettera: ");
                        arrayList.add(sceltaCambio.nextInt());
                        numeri = arrayList.toArray(numeri);
                    }

                }else{
                    System.out.println("scelta non valida");
                }
                    
            }else{
                exit="uscita";
            }
        }while(exit.equals("continua"));

    }


}