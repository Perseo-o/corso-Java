public class piattoSpeciale {
    private String paninoNormale;
    private String paninoSesamo;

    private int ingrediente1;
    private int ingrediente2;


    public String getPaninoNormale(){
        return paninoNormale;  
    }
    public String setPaninoNormale(String newpaninoNormale, int ingrediente1){
        return this.paninoNormale = newpaninoNormale;
    }

    public static void main(String[] args){

        piattoSpeciale piatto_speciale = new piattoSpeciale();
        piatto_speciale.setPaninoNormale("caddozone", 2);
        System.out.println(piatto_speciale.getPaninoNormale());
    }
}