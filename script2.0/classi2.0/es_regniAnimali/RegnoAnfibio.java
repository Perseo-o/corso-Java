import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RegnoAnfibio {
    
    private ArrayList<String> nome = new ArrayList<String>();
    private int x=0;

    public void SetAnfibio(String name, String nome){
        this.nome.add(name+" | "+nome);
        x++;
    }

    public String GetAnfibio(){

        this.name=this.name+" | Anfibio";
        return this.name;
    }
    
}
