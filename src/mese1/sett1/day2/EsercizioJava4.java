package mese1.sett1.day2;

import java.util.Scanner;
public class EsercizioJava4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero per iniziare il conto alla rovescia:");
        int numero = scanner.nextInt();

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
    }
}