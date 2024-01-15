package mese1.sett2.day1.ex3;

public class Prelievo {
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);
        try {
            conto1.preleva(1750.5);
            // Stampa saldo
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e.getMessage());
            e.printStackTrace();
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);
        try {
            conto2.preleva(2000);
            // Stampa saldo
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}