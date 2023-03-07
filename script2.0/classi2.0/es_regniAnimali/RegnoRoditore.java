import java.util.ArrayList;

public class RegnoRoditore {
    
    private ArrayList<String> nome = new ArrayList<String>();
    

    public void SetRoditore(String name, String nome){
        this.nome.add(name+" | "+nome);
    
    }

    public String GetRoditore(int x){
        
        this.nome.set(x,this.nome.get(x)+" | Anfibio");
        return this.nome.get(x);
        
    }
    
}
