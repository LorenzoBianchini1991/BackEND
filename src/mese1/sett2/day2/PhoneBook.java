package mese1.sett2.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public String findNumberByName(String name) {
        return contacts.getOrDefault(name, "Numero non trovato");
    }

    public String findNameByNumber(String number) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return "Nome non trovato";
    }

    public void printAllContacts() {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nGestione Rubrica Telefonica");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Rimuovi contatto");
            System.out.println("3. Trova numero per nome");
            System.out.println("4. Trova nome per numero");
            System.out.println("5. Stampa tutti i contatti");
            System.out.println("6. Esci");
            System.out.print("Scegli un'opzione: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Inserisci nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Inserisci numero: ");
                    String number = scanner.nextLine();
                    phoneBook.addContact(name, number);
                    break;
                case 2:
                    System.out.print("Inserisci nome del contatto da rimuovere: ");
                    name = scanner.nextLine();
                    phoneBook.removeContact(name);
                    break;
                case 3:
                    System.out.print("Inserisci nome per trovare il numero: ");
                    name = scanner.nextLine();
                    System.out.println("Numero: " + phoneBook.findNumberByName(name));
                    break;
                case 4:
                    System.out.print("Inserisci numero per trovare il nome: ");
                    number = scanner.nextLine();
                    System.out.println("Nome: " + phoneBook.findNameByNumber(number));
                    break;
                case 5:
                    phoneBook.printAllContacts();
                    break;
                case 6:
                    System.out.println("Uscita dal programma.");
                    return;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        }
    }
}