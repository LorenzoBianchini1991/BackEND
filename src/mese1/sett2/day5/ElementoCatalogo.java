package mese1.sett2.day5;

import java.io.Serializable;

public abstract class ElementoCatalogo implements Serializable {
    protected String codiceISBN;
    protected String titolo;
    protected int annoPubblicazione;
    protected int numeroPagine;

    public ElementoCatalogo(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine) {

        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public String getCodiceISBN() {
        return codiceISBN;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public abstract Object getAutore();
}
