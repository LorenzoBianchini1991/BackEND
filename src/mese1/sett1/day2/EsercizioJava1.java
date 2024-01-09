package mese1.sett1.day2;

public class EsercizioJava1 {

    public static void main(String[] args) {
        // Test metodo stringaPariDispari
        System.out.println("La stringa 'lorenzo' ha un numero pari di caratteri? " + stringaPariDispari("lorenzo"));
        System.out.println("La stringa 'java' ha un numero pari di caratteri? " + stringaPariDispari("java"));

        // Test metodo annoBisestile
        System.out.println("L'anno 2016 è bisestile? " + annoBisestile(2016));
        System.out.println("L'anno 2019 è bisestile? " + annoBisestile(2019));
    }

    // Metodo per controllare se una stringa ha un numero pari o dispari di caratteri
    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;
    }

    // Metodo per determinare se un anno è bisestile
    public static boolean annoBisestile(int anno) {
        return (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0));
    }
}