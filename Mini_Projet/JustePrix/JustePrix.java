package Mini_Projet.JustePrix;

import java.util.Scanner;
import java.util.Random;

public class JustePrix {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le Juste Prix !");
        System.out.println("Vous allez devoir trouver un nombre situé entre 1 et 100.");
        System.out.println("Vous êtes prêt ?");
        System.out.println("C'est parti !!");

        Scanner my_scan = new Scanner(System.in);
        Random my_random = new Random();
        int numComputer = my_random.nextInt(100)+1;
        int numUser = 0;
        int nmbTentatives = 0;
        System.out.println("\nL'ordinateur a trouvé généré son nombre.");
        
        System.out.println("\nVeuillez choisir trouver le nombre de l'ordinateur.");
        
        while (numUser != numComputer) {
            System.out.print("Nombre prémédité : ");
            numUser = my_scan.nextInt();
            if(numUser < numComputer){
                System.out.println("🔽Trop petit !");
            }
            if (numUser > numComputer) {
                System.out.println("🔼Trop grand !");
            }
            nmbTentatives++;
            /*if (numUser != numComputer) {
                System.out.println("❌Pas trouvé...");
            }*/
        }
        System.out.println("Bravo ! 🎉\nVous avez trouvé le nombre de l'ordinateur !");
        System.out.println("Vous avez vaincu l'ordinateur en "+nmbTentatives+" essaies !");

        my_scan.close();
    }
}
