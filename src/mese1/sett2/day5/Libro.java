package mese1.sett2.day5;

import java.io.Serializable;

public class Libro extends ElementoCatalogo implements Serializable {
    public String autore;
    public String genere;

    public Libro(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

}