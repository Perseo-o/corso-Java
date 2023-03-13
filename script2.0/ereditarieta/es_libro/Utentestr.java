package es_libro;

public class Utentestr {
    private String nome;
    private String password;
    private int id;

    public Utentestr(String nome, String password, int id) {
        this.nome = "nome";
        this.password = "password";
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public boolean confermaPassword(String password) {
        return this.password.equals(password);
    }
}