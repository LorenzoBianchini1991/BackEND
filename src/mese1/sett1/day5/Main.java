package mese1.sett1.day5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlayerMultimediale player = new PlayerMultimediale();

        // Inizializzazione degli elementi
        player.aggiungiElemento(new Audio("Audio 1", 3, 5));
        player.aggiungiElemento(new Video("Video 1", 2, 5, 7));
        player.aggiungiElemento(new Immagine("Immagine 1", 4));

        int scelta;
        do {
            System.out.println("Seleziona un elemento multimediale da eseguire:");
            System.out.println("1. Audio 1\n2. Video 1\n3. Immagine 1\n... (aggiungi altri elementi)\n0. Esci");
            System.out.print("Inserisci il tuo scelta: ");
            scelta = scanner.nextInt();

            if (scelta > 0 && scelta <= player.getNumeroElementi()) {
                player.eseguiElemento(scelta - 1);
            }
        } while (scelta != 0);

        scanner.close();
        System.out.println("Programma terminato.");
    }
}