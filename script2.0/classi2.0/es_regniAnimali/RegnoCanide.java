
public class RegnoCanide {
    private String name;

    public void SetCanide(String name, String nome){
        this.name=nome+" | "+name;
    }

    public String GetCanide(){
        this.name=this.name+" | Canide";
        return this.name;
    }
    
}
