/*A FAIRE :
    Ajoute des niveaux de difficulté (par exemple, facile : 1-50, difficile : 1-1000).
*/

package Mini_Projet.JustePrix;

import java.util.Scanner;
import java.util.Random;

public class JustePrix {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le Juste Prix !");
        System.out.println("Vous allez devoir trouver un nombre situé entre 1 et 100.");
        System.out.println("Vous êtes prêt ?");
        System.out.println("C'est parti !!");

        boolean isPlaying = true;
        Scanner my_scan = new Scanner(System.in);
        int bestScore = 100;
        int Score = 0;

        int choixMenu1 = menu(my_scan);

        if(choixMenu1 == 1){
            while (isPlaying) {
                Score = play(my_scan); // Passe le Scanner en paramètre

                System.out.print("Voulez-vous rejouer ? Oui/Non : ");
                try {
                    String replay = my_scan.nextLine();

                    if (replay.equalsIgnoreCase("Oui")) {
                        isPlaying = true;
                        if(Score < bestScore){
                            bestScore = Score;
                        }
                        System.out.println("Best score : "+bestScore);
                    } else if (replay.equalsIgnoreCase("Non")) {
                        isPlaying = false;
                        if(Score < bestScore){
                            bestScore = Score;
                        }
                        System.out.println("Best score : "+bestScore);
                        System.out.println("Merci d'avoir joué ! À bientôt !");
                    } else {
                        System.out.println("Erreur : Veuillez répondre par 'Oui' ou 'Non'.");
                    }
                } catch (Exception e) {
                    System.out.println("Erreur : Veuillez entrer une réponse valide.");
                }
            }
        }

        
        my_scan.close();
    }

    public static int play(Scanner my_scan) {
        Random my_random = new Random();
        int numComputer = my_random.nextInt(100) + 1;
        int numUser = 0;
        int nmbTentatives = 0;

        System.out.println("\nL'ordinateur a généré son nombre mystère.");
        System.out.println("À vous de jouer, essayez de deviner le nombre !");

        while (numUser != numComputer) {
            System.out.print("Votre proposition : ");
            try {
                numUser = my_scan.nextInt();
                if (numUser < numComputer) {
                    System.out.println("C'est plus grand !");
                } else if (numUser > numComputer) {
                    System.out.println("C'est plus petit !");
                }
                nmbTentatives++;
            } catch (Exception e) {
                System.out.println("Erreur : Veuillez entrer un nombre valide.");
                my_scan.next(); // Consomme l'entrée invalide pour éviter une boucle infinie
            }
        }

        System.out.println("Bravo ! Vous avez trouvé le nombre mystère !");
        System.out.println("Vous avez réussi en " + nmbTentatives + " essais !");
        my_scan.nextLine(); // Nettoie l'entrée après un `nextInt` pour éviter des problèmes dans `main()`

        return nmbTentatives;
    }

    public static void afficherRegles() {
        System.out.println("----- RÈGLES DU JEU 'DEVINE LE NOMBRE' -----");
        System.out.println("1. Le but du jeu est de deviner un nombre mystère.");
        System.out.println("2. Ce nombre est choisi aléatoirement entre 1 et 100.");
        System.out.println("3. À chaque tentative, vous devez entrer un nombre.");
        System.out.println("   - Si votre nombre est trop grand, on vous dira 'C'est plus petit !'.");
        System.out.println("   - Si votre nombre est trop petit, on vous dira 'C'est plus grand !'.");
        System.out.println("4. Continuez jusqu'à trouver le bon nombre.");
        System.out.println("5. Le jeu affiche le nombre de tentatives nécessaires pour trouver.");
        System.out.println("\nAmusez-vous bien et bonne chance !");
        System.out.println("------------------------------------------");
    }

    public static int menu(Scanner my_scan){
        int choixMenu;

        do {
            System.out.println("------------------------");
            System.out.println("Menu :");
            System.out.println("1. Jouer");
            System.out.println("2. Afficher les règles");
            System.out.println("3. Quitter");
            System.out.println("------------------------");
            System.out.print("Faites votre choix : ");
            
            while (!my_scan.hasNextInt()) {
                System.out.println("Erreur : Veuillez entrer un nombre valide.");
                my_scan.next(); // Consomme l'entrée invalide
                System.out.print("Veuillez choisir une option (1, 2 ou 3) : ");
            }
        
            choixMenu = my_scan.nextInt(); // Lecture du choix utilisateur

            switch (choixMenu) {
                case 1:
                    break;
                case 2:
                    afficherRegles();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choixMenu != 3 && choixMenu != 1);

        return choixMenu; // Quitte le programme
    }
}