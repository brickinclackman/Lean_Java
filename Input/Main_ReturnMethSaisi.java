package Input;

import java.util.Scanner;

public class Main_ReturnMethSaisi {
    public static int carre(int nombre) {
        return nombre * nombre; // Retourne le carré
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt(); // Saisie de l'utilisateur

        int resultat = carre(nombre); // Appel de la méthode
        System.out.println("Le carré de " + nombre + " est : " + resultat);

        scanner.close();
    }
}
