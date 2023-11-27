import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Invio with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int oneNumber = 300;
        int secondNumber = 100;

        System.out.println("Il prodotto è: " + oneNumber * secondNumber);

        String fraseNuova = "Ciao, oggi è il primo giorno di Backend";
        int newNumber = 125;

        System.out.println("concatenazione: " + fraseNuova + " " + newNumber);

        String[] arrayDiString = {"A" , "B" , "C" , "D" , "E"};
        String stringa = "Ciaone";

        String[] secondArray = {arrayDiString[0], arrayDiString[1], stringa,arrayDiString[2],arrayDiString[3], arrayDiString[4]};
        System.out.println(Arrays.toString(secondArray));
    }
}