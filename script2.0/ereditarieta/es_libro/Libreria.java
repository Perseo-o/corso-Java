package es_libro;

import java.util.ArrayList;

public class Libreria {
    private ArrayList<Libro> elencoLibri;
    private int numeroLibri;

    public Libreria() {
        elencoLibri = new ArrayList<>();
        elencoLibri.add(new Libro("Fantasy"));
        elencoLibri.add(new Libro("Horror"));
        elencoLibri.add(new Libro("Storia"));
        numeroLibri = elencoLibri.size();
    }

    public ArrayList<Libro> getElencoLibri() {
        return elencoLibri;
    }

    public Libro cercaLibroPerGenere(String genere) {
        for (Libro libro : elencoLibri) {
            if (libro.getGenere().equalsIgnoreCase(genere)) {
                return libro;
            }
        }
        return null;
    }

    public Libro cercaLibroInPrestito(Utentestr utente) {
        for (Libro libro : elencoLibri) {
            if (libro.getInPrestitoDa() == utente) {
                return libro;
            }
        }
        return null;
    }

    public void prendiInPrestitoLibro(Utentestr utente, Libro libro) {
        libro.setInPrestito(true);
        libro.setInPrestitoDa(utente);
    }

    public void restituisciLibro(Utentestr utente, Libro libro) {
        libro.setInPrestito(false);
        libro.setInPrestitoDa(null);
    }

    class Libro {
        private String genere;
        private boolean inPrestito;
        private Utentestr inPrestitoDa;

        public Libro(String genere) {
            this.genere = genere;
            this.inPrestito = false;
            this.inPrestitoDa = null;
        }

        public String getGenere() {
            return genere;
        }

        public boolean isInPrestito() {
            return inPrestito;
        }

        public void setInPrestito(boolean inPrestito) {
            this.inPrestito = inPrestito;
        }

        public Utentestr getInPrestitoDa() {
            return inPrestitoDa;
        }

        public void setInPrestitoDa(Utentestr inPrestitoDa) {
            this.inPrestitoDa = inPrestitoDa;
        }
    }
}