import java.util.ArrayList;

public class RegnoAnfibio {
    
    private ArrayList<String> nome = new ArrayList<String>();
    

    public void SetAnfibio(String name, String nome){
        this.nome.add(name+" | "+nome);
    
    }

    public String GetAnfibio(int x){
        
        this.nome.set(x,this.nome.get(x)+" | Anfibio");
        return this.nome.get(x);
        
    }
    
}
