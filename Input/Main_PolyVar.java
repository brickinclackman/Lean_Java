package Input;

import java.util.Locale;
import java.util.Scanner;

public class Main_PolyVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Utiliser le point comme séparateur décimal / si vous préférez la virgule au point, enlevez cette ligne !

        System.out.print("Entrez un nombre entier : ");
        int entier = scanner.nextInt(); // Lecture d'un entier

        System.out.print("Entrez un nombre décimal : ");
        double decimal = scanner.nextDouble(); // Lecture d'un nombre décimal

        scanner.nextLine(); // Consommer le retour à la ligne (important après nextInt ou nextDouble)

        System.out.print("Entrez un texte : ");
        String texte = scanner.nextLine(); // Lecture d'une ligne de texte

        System.out.println("Entier : " + entier);
        System.out.println("Décimal : " + decimal);
        System.out.println("Texte : " + texte);

        scanner.close();
    }
}
