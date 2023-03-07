
import java.util.ArrayList;

public class RegnoFelino {

    private ArrayList<String> nome = new ArrayList<String>();

    public void SetFelino(String name, String nome) {
        this.nome.add(name + " | " + nome);

    }

    public String GetFelino(int x) {

        this.nome.set(x, this.nome.get(x) + " | Felino");
        return this.nome.get(x);

    }

}