package mese1.sett1.day5;

import java.util.ArrayList;

public class PlayerMultimediale {
    private ArrayList<ElementoMultimediale> elementi;

    public PlayerMultimediale() {
        elementi = new ArrayList<>();
    }

    public void aggiungiElemento(ElementoMultimediale elemento) {
        elementi.add(elemento);
    }

    public int getNumeroElementi() {
        return elementi.size();
    }

    public void eseguiElemento(int indice) {
        if (indice >= 0 && indice < elementi.size()) {
            elementi.get(indice).show();
        }
    }
}