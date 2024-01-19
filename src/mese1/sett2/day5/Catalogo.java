package mese1.sett2.day5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalogo implements Serializable {
    private List<ElementoCatalogo> elementi;

    public Catalogo() {
        elementi = new ArrayList<>();
    }

    public void aggiungiElemento(ElementoCatalogo elemento) {
        elementi.add(elemento);
    }

    public void rimuoviElementoPerISBN(String isbn) {
        elementi.removeIf(e -> e.getCodiceISBN().equals(isbn));
    }

    public List<ElementoCatalogo> ricercaPerISBN(String isbn) {
        return elementi.stream()
                .filter(e -> e.getCodiceISBN().equals(isbn))
                .collect(Collectors.toList());
    }

    public List<ElementoCatalogo> ricercaPerAnnoPubblicazione(int anno) {
        return elementi.stream()
                .filter(e -> e.getAnnoPubblicazione() == anno)
                .collect(Collectors.toList());
    }

    public List<ElementoCatalogo> ricercaPerAutore(String autore) {
        return elementi.stream()
                .filter(e -> e instanceof Libro && ((Libro) e).getAutore().equals(autore))
                .collect(Collectors.toList());
    }

    public void salvaSuDisco(String percorsoFile) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(percorsoFile))) {
            out.writeObject(this);
        }
    }

    public static Catalogo caricaDaDisco(String percorsoFile) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(percorsoFile))) {
            return (Catalogo) in.readObject();
        }
    }
}
