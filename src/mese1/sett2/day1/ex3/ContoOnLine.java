package mese1.sett2.day1.ex3;

public class ContoOnLine extends ContoCorrente {
    double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    @Override
    void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("Il prelievo non è disponibile");
        }
        super.preleva(x);
    }

    void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + movimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }
}