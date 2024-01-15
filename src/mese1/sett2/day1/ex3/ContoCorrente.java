package mese1.sett2.day1.ex3;

public class ContoCorrente {
    String titolare;
    int movimenti;
    final int maxMovimenti = 50;
    double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.movimenti = 0;
    }

    void preleva(double x) throws BancaException {
        if (movimenti < maxMovimenti) {
            saldo -= x;
        } else {
            saldo -= x + 0.50;
        }
        movimenti++;

        if (saldo < 0) {
            throw new BancaException("Il conto è in rosso");
        }
    }

    double restituisciSaldo() {
        return saldo;
    }
}
