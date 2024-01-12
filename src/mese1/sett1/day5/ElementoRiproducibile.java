package mese1.sett1.day5;

public abstract class ElementoRiproducibile implements ElementoMultimediale {
    protected String titolo;
    protected int durata;
    protected int volume;

    public ElementoRiproducibile(String titolo, int durata, int volume) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    public abstract void play();
}
