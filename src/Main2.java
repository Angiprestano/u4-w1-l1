import java.util.Scanner;

public class Main2 {
    public static void main (String[] args) {
        Scanner request = new Scanner(System.in);
        System.out.println("Inserisci le tue credenziali");
        String name = request.nextLine();
        String surname = request.nextLine();
        String email = request.nextLine();

        System.out.println(name + surname + " " + email );
    }
}
