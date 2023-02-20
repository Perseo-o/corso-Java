/*Andiamo a creare un primo menù che ci fa entrare o chiudere subito 
ogni nuovo ingresso randomizzeremo un budget per il cliente e terremo il conto dei clienti e fine app stamperemo 
totale speso e nr clienti
Andiamo a creare un menu con 4 scelte Compra, vedi, aggiungi, Esci

Compra farà vedere una lista di piatti che puoi comprare stampando , nome, prezzo (int) e ingredienti (minimo 2)
 e darà la possibilità di comprarlo se il nostro budget e sufficiente la disp. qui non si vedrà

Vedi: stamperà la lista piatti e le loro disponibilità una volta finito un piatto dovrà non essere più ordinabile

Aggiungi: Se si conosce una password, si avranno due scelte, resetta disponibilità che mette tutte le disponibilità 
come all'Inizio e aggiungi piatto

Esci, ci riporta al primo menu e ci permetta di riiniziare o terminare */
package cicli;
import java.util.Scanner;

//import javax.lang.model.util.ElementScanner6;
public class menuEsame {

    public static void main(String[] args) {
        int dispC=20, dispP=20, prezzoC=18, prezzoP=22, numeroCli=0, aiuto, comp, vendite=0, dispNuovoP=0, prezzoNuovoP=0;
        String nomePriP="carne", nomeSecP="pesce", nomeNuovoP=" ",pIngNuovo="", sIngNuovo="", pIngC="carne", sIngC="rosmarino", pIngP="pesce", sIngP="sale", scel4="";
        Scanner scelta = new Scanner(System.in);
        Scanner scelta2 = new Scanner(System.in);
        Scanner verifica = new Scanner(System.in);
        Scanner scelte4 = new Scanner(System.in);
        Scanner compra = new Scanner(System.in);
        String scel;

        do{
            System.out.println("digita si per entrare nel secondo menu 2 per uscire");
            scel= scelta.nextLine();
            //guardiamo se vuole ordinare
            if(scel.equals("si")){
                //diamo il budget
                double budget=(Math.random() + 10)*10;
                numeroCli++;
                do{
                    //qua avremmo il secondo menu
                    System.out.println("seleziona 1 per compra, 2 per vedi, 3 per scelta, 4 per esci ");
                    int secondoM= scelta2.nextInt();
                    switch(secondoM){
                    case 1:
                        if(budget>=prezzoP && dispP>0){
                            System.out.println(nomeSecP+" prezzo: "+ prezzoP+" gli ingredienti di questo piatto sono: "+ pIngP+" "+sIngP);
                            System.out.println("vuoi comprarlo?: 1 si, 2 no");
                            comp= compra.nextInt();
                            if(comp==1){
                                dispP--;
                                budget=budget-prezzoP;
                                vendite=vendite+prezzoP;
                            }
                        }else{
                            System.out.println("non hai abbastanza soldi per comprare questo piatto");
                        }
                        if(budget>=prezzoC && dispC>0){
                            System.out.println(nomePriP +" prezzo: "+ prezzoC+" gli ingredienti di questo piatto sono: "+ pIngC+" "+sIngC);
                            System.out.println("vuoi comprarlo?: 1 si, 2 no");
                            comp= compra.nextInt();
                            if(comp==1){
                                dispC--;
                                budget=budget-prezzoC;
                                vendite=vendite+prezzoC;
                            }
                        }else{
                            System.out.println("non hai abbastanza soldi per comprare questo piatto");
                        }
                        System.out.println("Se vuoi tornare al secondo menù premi 1 se vuoi uscire dall'app premi 2");
                        aiuto= scelte4.nextInt();
                        if(aiuto==1){
                            scel4="si";
                        }else{
                            scel4="no";
                        }
                    break;

                    case 2:
                            System.out.println("nel menù abbiamo"+nomePriP+" "+nomeSecP+" del primo piatto la disponibilità è: "+ dispC+" del primo piatto la disponibilità è: "+dispP);
                            System.out.println("Se vuoi tornare al secondo menù premi 1 se vuoi uscire dall'app premi 2");
                            aiuto = scelte4.nextInt();
                            if(aiuto==1){
                                scel4="si";
                            }else{
                                scel4="no";
                            }
                    break;
                    case 3:
                        System.out.println("Immetti password");
                        String verPass= verifica.nextLine();
                        if(verPass.equals("sconosciuto")){
                            System.out.println("password confermata, per resettare disponibilita prema 1 per aggiungere un piatto prema 2");
                            int sceltaDiff= verifica.nextInt();
                            if(sceltaDiff==1){
                                dispC=20;
                                dispP=20;
                            }else{
                                System.out.println("inserire nome piatto");
                                nomeNuovoP = verifica.nextLine();
                                System.out.println("inserire secondo ingrediente");
                                pIngNuovo= verifica.nextLine();
                                System.out.println("inserire secondo ingrediente");
                                sIngNuovo= verifica.nextLine();
                                System.out.println("inserire prezzo");
                                prezzoNuovoP= verifica.nextInt();
                            }
                        }else{
                            System.out.println("password errata");
                        }
                        System.out.println("Se vuoi tornare al secondo menù premi 1 se vuoi uscire dall'app premi 2");
                        aiuto= scelte4.nextInt();
                        if(aiuto==1){
                            scel4="si";
                        }else{
                            scel4="no";
                        }
                    break;
                    case 4:
                        System.out.println("per uscire dall'app premere 1 per riniziare come nuovo cliente premere 2");
                        String uscita4= verifica.nextLine();
                        if(uscita4.equals("1")){
                            scel4="no";
                        }else{
                           scel4="siMa";
                        }
                    break;
                    }
                }while(scel4.equals("si"));
                if(scel4.equals("no")){
                    scel="no";
                }else if(scel4.equals("siMa")){
                    scel4="si";
                }
            }
        }while(scel.equals("si"));
        System.out.println("Ci sono stati: "+numeroCli+" ,i soldi che i clienti hanno speso sono: "+vendite);
        scelta.close();
        scelta2.close();
        verifica.close();
        scelte4.close();
        compra.close();               
    }
}