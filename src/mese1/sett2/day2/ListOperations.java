package mese1.sett2.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListOperations {
    public static List<Integer> generateRandomList(int n) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(101)); // Numeri da 0 a 100
        }
        return list;
    }

    public static List<Integer> reverseAndDuplicateList(List<Integer> original) {
        List<Integer> newList = new ArrayList<>(original);
        Collections.reverse(newList);
        newList.addAll(0, original);
        return newList;
    }

    public static void printEvenOddValues(List<Integer> list, boolean even) {
        for (int i = 0; i < list.size(); i++) {
            if ((even && i % 2 == 0) || (!even && i % 2 != 0)) {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> randomList = generateRandomList(10);
        System.out.println("Lista originale: " + randomList);

        List<Integer> duplicatedList = reverseAndDuplicateList(randomList);
        System.out.println("Lista modificata: " + duplicatedList);

        printEvenOddValues(duplicatedList, true); // Stampa valori in posizioni pari
        printEvenOddValues(duplicatedList, false); // Stampa valori in posizioni dispari
    }
}