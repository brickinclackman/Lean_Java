package Input;

import java.util.Scanner; // Import de la classe Scanner

public class Main_Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Création d'un Scanner
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine(); // Lecture d'une ligne tapée par l'utilisateur
        System.out.println("Bonjour, " + nom + " !");
        scanner.close(); // Toujours fermer le Scanner pour éviter les fuites de ressources
    }
}
