package mese1.sett1.day5;

public class Immagine implements ElementoMultimediale {
    private String titolo;
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        this.titolo = titolo;
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }

    @Override
    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }
}

