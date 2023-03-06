
public class RegnoFelino {
   
    private String name;

    public void SetFelino(String name, String nome){
        this.name=nome+" | "+name;
    }

    public String GetFelino(){
        this.name=this.name+" | Felino";
        return this.name;
    }

}
