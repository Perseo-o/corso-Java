package es_Veicolo;

public class Moto extends Veicolo{
    private int Cilindrata;
    private String Tipologia;
    private double Potenza;

    public Moto (String Marca, String Modello, String AnnoFabbricazione, int Cilindrata, String Tipologia, double Potenza){
        super(Marca, Modello, AnnoFabbricazione);

        this.Cilindrata = Cilindrata;
        this.Tipologia =  Tipologia;
        this.Potenza = Potenza;

    }

    public void SetCilindrata(int Cilindrata) {
        this.Cilindrata = Cilindrata;
    }

    public void SetTipologia(String Tipologia) {
        this.Tipologia = Tipologia;
    }

    public void SetPotenza(double Potenza) {
        this.Potenza = Potenza;
    }


    public int GetCilindrata() {
        return Cilindrata;
    }

    public String GetTipologia() {
        return Tipologia;
    }

    public double GetPotenza() {
        return Potenza;
    }



}