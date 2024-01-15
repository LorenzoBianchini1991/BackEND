package mese1.sett2.day2.ex2;

import java.util.Scanner;

public class ConsumoCarburante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Inserire i km percorsi:");
            double km = scanner.nextDouble();

            System.out.println("Inserire i litri di carburante consumati:");
            double litri = scanner.nextDouble();

            if (litri == 0) throw new ArithmeticException("I litri non possono essere zero.");

            double kmPerLitro = km / litri;
            System.out.println("Km/litro percorsi: " + kmPerLitro);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
