package mese1.sett1.day2;

import java.util.Scanner;

public class EsercizioJava3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci una stringa (digita ':q' per uscire):");
            String input = scanner.nextLine();

            if (input.equals(":q")) {
                break;
            }

            String risultato = String.join(",", input.split(""));
            System.out.println("Stringa suddivisa: " + risultato);
        }
    }
}