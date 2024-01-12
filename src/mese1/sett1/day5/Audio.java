package mese1.sett1.day5;

public class Audio extends ElementoRiproducibile {
    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata, volume);
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }

    @Override
    public void show() {
        play();
    }
}
