package mese1.sett2.day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero di parole: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Set<String> words = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        System.out.println("Inserisci le parole:");
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if (!words.add(word)) { // Se la parola è già presente
                duplicates.add(word);
            }
        }

        System.out.println("Parole duplicate: " + duplicates);
        System.out.println("Numero di parole distinte: " + words.size());
        System.out.println("Elenco parole distinte: " + words);
    }
}