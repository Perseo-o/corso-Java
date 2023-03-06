
public class RegnoRoditore {
    
    private String name;

    public void SetRoditore(String name, String nome){
        this.name=nome+" | "+name;
    }

    public String GetRoditore(){
        this.name=this.name+" | Roditore";
        return this.name;
    }
    
}
