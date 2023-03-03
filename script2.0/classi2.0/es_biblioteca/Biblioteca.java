package es_biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<String> ElencoLibri = new ArrayList<String>();
    private ArrayList<Integer> CopieDisponibili = new ArrayList<Integer>();
    private ArrayList<Integer> CopiePrestito = new ArrayList<Integer>();
    private int x=0;

    public void SetElencoLibri(String nuovoLibro){
        ElencoLibri.add(nuovoLibro);
        x++;
    }

    public void SetCopieDisponibili(int copieDisponibili){
        CopieDisponibili.add(copieDisponibili);
    }

    public void SetCopiePrestito(int copiePrestito){
        CopiePrestito.add(copiePrestito);
    }

    public void PrestaLibro(String nome){
        for(int y=0;y<=x;y++){
            if(nome.equals(ElencoLibri.get(y))){
                CopieDisponibili.set(y, CopieDisponibili.get(y)-1);
                CopiePrestito.set(y, CopiePrestito.get(y)+1);
            }else{
                System.out.println("Nome non disponibile");
            }
        }
    }

    public void RestituisciLibro(String nome){
        for(int y=0;y<=x;y++){
            if(nome.equals(ElencoLibri.get(y))){
                CopieDisponibili.set(y, CopieDisponibili.get(y)+1);
                CopiePrestito.set(y, CopiePrestito.get(y)-1);
            }else{
                System.out.println("Nome non disponibile");
            }
        } 
    }

    public void AggiungiLibro(String nome, int copie){
        SetElencoLibri(nome); 
        SetCopieDisponibili(copie);
        SetCopiePrestito(0);
    }

    public void StampaLibriDisponibili(){
        for(int y=0;y<=x;y++){
            ElencoLibri.get(y);
            CopieDisponibili.get(y);
        }
    }

    public void RimuoviLibro(String nome){
        for(int y=0;y<=x;y++){
            if(nome.equals(ElencoLibri.get(y))){
                if(CopieDisponibili.get(y)<=0){
                    System.out.println("Non ci sono copie disponibili da togliere");
                }else{
                CopieDisponibili.set(y, CopieDisponibili.get(y)-1);
                }
            }else{
                System.out.println("Nome non disponibile");
            }
        }
    }

    public static void main(String[] args) {
        String nomeL;
        int quantiL;
        Biblioteca Biblio= new Biblioteca();
        Scanner scelta = new Scanner(System.in);
        boolean primoLivello=true, secondoLivello=true;
        do{
            System.out.println("Cosa vuoifare?\n[1]Per entrare in biblioteca\n[2]Per uscire:");
            int sce1=scelta.nextInt();
            if(sce1==1){
                do{
                    System.out.println("Cosa vuoifare?\n[1]Prendere in prestito un libro\n[2]Restituire un libro\n[3]Aggiungere un titolo\n[4]Rimuovere una copia di un libro\n[5]Vedere tuttii titoli registrati\n[6]Per uscire:");
                    int sce2=scelta.nextInt();
                    switch(sce2){
                        case 1:
                            System.out.println("Inserire nome del libro da voler ritirare");
                            nomeL=scelta.nextLine();
                            Biblio.PrestaLibro(nomeL);
                        break;
                        case 2:
                            System.out.println("Inserire nome del libro da voler restituire");
                            nomeL=scelta.nextLine();
                            Biblio.RestituisciLibro(nomeL);
                        break;
                        case 3:
                            System.out.println("Inserire nome del libro da voler aggiungere");
                            nomeL=scelta.nextLine();
                            System.out.println("Inserire disponibilità del libro da voler aggiungere");
                            quantiL=scelta.nextInt();
                            Biblio.AggiungiLibro(nomeL, quantiL);
                        break;
                        case 4:
                            System.out.println("Inserire nome del libro da voler togliere");
                            nomeL=scelta.nextLine();
                            Biblio.RimuoviLibro(nomeL);
                        break;
                        case 5:
                            Biblio.StampaLibriDisponibili();
                        break;
                        default:
                            secondoLivello=false;
                        break;
                    }
                }while(secondoLivello==true);
            }else{
                primoLivello=false;
            }

        }while(primoLivello==true);




    }
}
