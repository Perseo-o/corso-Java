package es_biblioteca;
import java.util.Random;
import java.util.UUID;

public class utente {
    private String nomeUtente;
    private String password;
    private UUID id;

    public utente(String nomeUtente, String password) {
        this.nomeUtente = nomeUtente;
        this.password = password;
        this.id = UUID.randomUUID(); // Genera un ID univoco in modo automatico
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public boolean verificaPassword(String password) {
        return this.password.equals(password);
    }

  
}