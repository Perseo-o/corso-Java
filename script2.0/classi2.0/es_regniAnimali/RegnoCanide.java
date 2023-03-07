
import java.util.ArrayList;

public class RegnoCanide {

    private ArrayList<String> nome = new ArrayList<String>();

    public void SetCanide(String name, String nome) {
        this.nome.add(name + " | " + nome);

    }

    public String GetCanide(int x) {

        this.nome.set(x, this.nome.get(x) + " | Canide");
        return this.nome.get(x);

    }

}