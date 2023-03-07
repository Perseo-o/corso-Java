package es_Veicolo;


public class Auto extends Veicolo{
    private int NumPorte;
    private String TipoCarburante;
    private double ConsumoMedio;

    public Auto (String Marca, String Modello, String AnnoFabbricazione, int NumPorte, String TipoCarburante, double ConsumoMedio) {

        super(Marca, Modello, AnnoFabbricazione);

        this.NumPorte = NumPorte;
        this.TipoCarburante = TipoCarburante;
        this.ConsumoMedio = ConsumoMedio;
    }

    public void SetNumPorte(int NumPorte) {
        this.NumPorte = NumPorte;
    }

    public void SetTipoCarburante(String TipoCarburante) {
        this.TipoCarburante = TipoCarburante;
    }

    public void SetConsumoMedio(double ConsumoMedio) {
        this.ConsumoMedio = ConsumoMedio;
    }

    public int GetNumPorte() {
        return NumPorte;
    }

    public String GetTipoCarburante() {
        return TipoCarburante;
    }

    public double GetConsumoMedio() {
        return ConsumoMedio;
    }

}