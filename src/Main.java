public class Main {

    public static void main(String[] args) {

        System.out.print("Ciao da main\n");
        System.out.print("Ciao seconda riga\n");

        System.out.println("nuova riga");

        /*
         * Java video 4 - Variabili
         *
         * 1 - Cos'è una variabile (possiamo definirla come una scatola
         * a cui apportiamo un valore) es: x = 10
         *
         * 2 - Dichiarazione, assegnazione e inizializzazione
         * 3 - Variabili con diversi tipi di dati
         * 4 - Nomenclatura delle variabili
         */

        // 2 -:
        int x;      // dichiarazione di una variabile
        String nome;
        double temperatura;

        x = 45;     // assegnazione di un valore
        nome = "Luca";
        temperatura = 36.89;

        x = 100;    // riassegnazione valore
        nome= "Lucia";
        temperatura = 89.56;

        int y = 45; // Inizializzazione
        String cognome = "Luca";
        double controlloTemperatura = 78.5; //nomenclatura standard
        final double CONTROLLO_TEMPERATURA = 80.5; // nomenclatura costanti

        System.out.println(controlloTemperatura); // Stampa a capo
        System.out.print(CONTROLLO_TEMPERATURA); // Stampa senza andare a capo
    }
}