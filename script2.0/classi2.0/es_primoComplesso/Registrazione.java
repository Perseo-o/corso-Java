/*import java.util.ArrayList;
import java.util.Arrays;
import java.math.*;

public class Registrazione {

    private String nome;
    private String password;
    private double budget=Math.random()*100;
    private ArrayList<String> nomiS= new ArrayList<String>();
    private ArrayList<String> passwordS= new ArrayList<String>();
    private int numeroRegistrati=0;

    public Registrazione(String nome,String password,String[] nomi, String[] passwords) {
            
            this.nome = nome;
            this.password=password;
            this.nomiS = new ArrayList<>(Arrays.asList(nomi));
            this.passwordS = new ArrayList<>(Arrays.asList(passwords));
            this.nomiS.add(numeroRegistrati, this.nome);
            this.passwordS.add(numeroRegistrati, this.password);
            numeroRegistrati++;
                
            
        }

    public int getNumeroRegistrati(){
        return numeroRegistrati;
    }
    

    public String getNome() {
        return nome;
    }

    public double getBudget() {
        return budget;
    }
}*/