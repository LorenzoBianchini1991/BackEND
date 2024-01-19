package mese1.sett2.day5;

import java.io.Serializable;

public class Rivista extends ElementoCatalogo implements Serializable {
    @Override
    public Object getAutore() {

        return null;
    }

    public enum Periodicita {
        SETTIMANALE, MENSILE, SEMESTRALE
    }

    public Periodicita periodicita;

    public Rivista(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }
}
