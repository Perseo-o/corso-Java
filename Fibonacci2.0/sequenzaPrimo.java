
    import java.util.Scanner;
    
    public class sequenzaPrimo {
        public static void main(String[] args) {
                int i=0, nF1=0, nF2=1, nFS;

                Scanner scelta1 = new Scanner(System.in);
                Scanner inserimentoDati = new Scanner(System.in);
                
                System.out.println("stampare o cercare? ");
                String scelta= scelta1.nextLine();
                if(scelta.equals("stampare")){
                    System.out.println("inserisci a che numero di fibonacci vuoi arrivare");
                    int y= inserimentoDati.nextInt();
                    System.out.println("I numeri di fibonacci sono: ");
                    while(y>=0){
                        nFS=nF1;
                        nF1=nF2;
                        nF2=nFS;
                        nF1=nF1+nF2;
                        y--;
                        if(nF1%2==0){
                            System.out.println(nF1+" ");
                        }
                    }
                }else if(scelta.equals("cercare")){
                    System.out.println("inserisci a che numero di fibonacci che vuoi cercare");
                    int x= inserimentoDati.nextInt();
                    System.out.println(" ");
                    int z=0;
                    while(nF1<=x){
                        nFS=nF1;
                        nF1=nF2;
                        nF2=nFS;
                        nF1=nF1+nF2;
                        z++;
                        if(nF1==x){
                            System.out.println("Il tuo numero è stato trovato ed è il "+z);
                        }
                    }
                    
                }
            inserimentoDati.close();
        }
    }