package mese1.sett2.day5;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        // Creazione di alcuni libri e aggiunta al catalogo
        Libro libro1 = new Libro("ISBN-12345", "Il Grande Gatsby", 1925, 180, "F. Scott Fitzgerald", "Romanzo");
        Libro libro2 = new Libro("ISBN-54321", "1984", 1949, 328, "George Orwell", "Distopia");
        catalogo.aggiungiElemento(libro1);
        catalogo.aggiungiElemento(libro2);

        // Creazione di alcune riviste e aggiunta al catalogo
        Rivista rivista1 = new Rivista("ISBN-11111", "National Geographic", 2020, 100, Rivista.Periodicita.MENSILE);
        Rivista rivista2 = new Rivista("ISBN-22222", "Science Today", 2021, 80, Rivista.Periodicita.SETTIMANALE);
        catalogo.aggiungiElemento(rivista1);
        catalogo.aggiungiElemento(rivista2);

        // Esempio di ricerca per autore
        System.out.println("Ricerca per autore: F. Scott Fitzgerald");
        List<ElementoCatalogo> risultatiAutore = catalogo.ricercaPerAutore("F. Scott Fitzgerald");
        risultatiAutore.forEach(Main::stampaDettagli);

        // Salva e carica il catalogo
        try {
            catalogo.salvaSuDisco("catalogo.dat");
            Catalogo catalogoCaricato = Catalogo.caricaDaDisco("catalogo.dat");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Si è verificato un errore: " + e.getMessage());
        }
    }

    private static void stampaDettagli(ElementoCatalogo elemento) {
        System.out.println("Titolo: " + elemento.titolo);
        System.out.println("Codice ISBN: " + elemento.codiceISBN);
        System.out.println("Anno di pubblicazione: " + elemento.annoPubblicazione);
        System.out.println("Numero di pagine: " + elemento.numeroPagine);

        if (elemento instanceof Libro) {
            Libro libro = (Libro) elemento;
            System.out.println("Autore: " + libro.autore);
            System.out.println("Genere: " + libro.genere);
        } else if (elemento instanceof Rivista) {
            Rivista rivista = (Rivista) elemento;
            System.out.println("Periodicità: " + rivista.periodicita);
        }

        System.out.println(); // Una riga vuota per separare gli elementi
    }
}
