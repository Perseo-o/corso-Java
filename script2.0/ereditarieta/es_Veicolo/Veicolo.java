package es_Veicolo;

public class Veicolo {

    private String Marca, Modello, AnnoFabbricazione;

    public Veicolo(String Marca, String Modello, String AnnoFabbricazione) {
        this.Marca = Marca;
        this.Modello = Modello;
        this.AnnoFabbricazione = AnnoFabbricazione;
    }

    public void SetMarca(String Marca){
        this.Marca=Marca;
        System.out.println("Paren's show()");
    }

    public void SetMdello(String Modello){
        this.Modello=Modello;
        System.out.println("Paren's show()");
    }

    public void SetAnnoFabbricazione(String AnnoFabbricazione){
        this.AnnoFabbricazione=AnnoFabbricazione;
        System.out.println("Paren's show()");
    }

    public String GetMarca(){
        return this.Marca;
    }

    public String GetModello(){
        return this.Modello;
    }

    public String GetAnnoFabbricazione(){
        return this.AnnoFabbricazione;
    }
        
    


}