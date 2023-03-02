import javax.print.DocFlavor.STRING;

public class piattoSpeciale {
    private String paninoNormale;
    private String paninoSesamo;

    private String ingrediente1;
    private String ingrediente2;


    public String getPaninoNormale(){
        return paninoNormale;  
    }

    public String getPaninoSpeciale(){
        return paninoSesamo;  
    }

    
    

    public static void main(String[] args){

        piattoSpeciale piatto_speciale = new piattoSpeciale();
        System.out.println("panino");
        piatto_speciale.setPaninoNormale(2);
        System.out.println(piatto_speciale.getPaninoNormale());
    }
    public String setPaninoNormale(int scelta){
        String paninoFine=null;
        String newpaninoNormale= "Pane ,", ingrediente1="Salsiccia ", ingrediente2=" Maionese";
        if(scelta==0){
                paninoFine= ingrediente1;
        }else if(scelta==1){
                paninoFine= ingrediente2;
        }else if(scelta==2){
            paninoFine= ingrediente1+ingrediente2;
                
        }else if(scelta==3){
                return null;
        }else{
                System.out.println("scelta non valida");
        }
        paninoFine= newpaninoNormale+paninoFine;
        return this.paninoNormale=paninoFine;
    }
}