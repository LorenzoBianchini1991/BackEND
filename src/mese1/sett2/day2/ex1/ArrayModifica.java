package mese1.sett2.day2.ex1;

import java.util.Random;
import java.util.Scanner;

public class ArrayModifica {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        // Riempimento iniziale dell'array
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }
        System.out.println("Array iniziale: ");
        stampaArray(array);

        // Modifica dell'array
        int posizione, valore;
        do {
            System.out.println("Inserire la posizione per la modifica (0-4) e il valore (inserire 0 per terminare):");
            posizione = scanner.nextInt();
            if (posizione == 0) break;
            valore = scanner.nextInt();
            try {
                array[posizione] = valore;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posizione non valida. Riprovare.");
            }
            stampaArray(array);
        } while (valore != 0);

        scanner.close();
    }

    private static void stampaArray(int[] array) {
        for (int valore : array) {
            System.out.print(valore + " ");
        }
        System.out.println();
    }
}