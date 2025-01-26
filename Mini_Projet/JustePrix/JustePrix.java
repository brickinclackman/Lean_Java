/*A FAIRE :
    Ajoute des niveaux de difficulté (par exemple, facile : 1-50, difficile : 1-1000).
*/

package Mini_Projet.JustePrix;

import java.util.Scanner;
import java.util.Random;

public class JustePrix {
    public static void main(String[] args) {
        // Codes ANSI
        final String RESET = "\033[0m";
        final String RED = "\033[31m";
        final String YELLOW = "\033[33m";
        final String BLUE = "\033[34m";
        final String BOLD = "\033[1m";     // Gras

        System.out.println(YELLOW + BOLD + "Bienvenue dans le Juste Prix !"+RESET);
        System.out.println(BLUE + "Vous allez devoir trouver un nombre situé entre 1 et 100."+RESET);
        System.out.println(BLUE + "Vous êtes prêt ?"+RESET);
        System.out.println(BLUE + "C'est parti !!"+RESET);

        boolean isPlaying = true;
        Scanner my_scan = new Scanner(System.in);
        int bestScore = 100;
        int Score = 0;

        int choixMenu1 = menu(my_scan);

        if(choixMenu1 == 1){
            while (isPlaying) {
                Score = play(my_scan); // Passe le Scanner en paramètre

                System.out.print("Voulez-vous rejouer ? Oui/Non : "+RESET);
                try {
                    String replay = my_scan.nextLine();

                    if (replay.equalsIgnoreCase("Oui")) {
                        isPlaying = true;
                        if(Score < bestScore){
                            bestScore = Score;
                        }
                        System.out.println(YELLOW + "Best score : "+bestScore+RESET);
                    } else if (replay.equalsIgnoreCase("Non")) {
                        isPlaying = false;
                        if(Score < bestScore){
                            bestScore = Score;
                        }
                        System.out.println(YELLOW+"Best score : "+bestScore+RESET);
                        System.out.println(BLUE + "Merci d'avoir joué ! À bientôt !"+RESET);
                    } else {
                        System.out.println(RED+"Erreur : Veuillez répondre par 'Oui' ou 'Non'."+RESET);
                    }
                } catch (Exception e) {
                    System.out.println(RED+"Erreur : Veuillez entrer une réponse valide."+RESET);
                }
            }
        }

        
        my_scan.close();
    }

    public static int play(Scanner my_scan) {
        // Codes ANSI
        final String RESET = "\033[0m";
        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        final String YELLOW = "\033[33m";
        final String BLUE = "\033[34m";

        Random my_random = new Random();
        int numComputer = my_random.nextInt(100) + 1;
        int numUser = 0;
        int nmbTentatives = 0;

        System.out.println(BLUE + "\nL'ordinateur a généré son nombre mystère."+RESET);
        System.out.println(BLUE + "À vous de jouer, essayez de deviner le nombre !"+RESET);

        while (numUser != numComputer) {
            System.out.print(BLUE + "Votre proposition : "+RESET);
            try {
                numUser = my_scan.nextInt();
                if (numUser < numComputer) {
                    System.out.println(BLUE + "C'est plus grand !"+RESET);
                } else if (numUser > numComputer) {
                    System.out.println(BLUE + "C'est plus petit !"+RESET);
                }
                nmbTentatives++;
            } catch (Exception e) {
                System.out.println(RED+"Erreur : Veuillez entrer un nombre valide."+RESET);
                my_scan.next(); // Consomme l'entrée invalide pour éviter une boucle infinie
            }
        }

        System.out.println(GREEN+"Bravo ! Vous avez trouvé le nombre mystère !"+RESET);
        System.out.println(YELLOW+"Vous avez réussi en " + nmbTentatives + " essais !"+RESET);
        my_scan.nextLine(); // Nettoie l'entrée après un `nextInt` pour éviter des problèmes dans `main()`

        return nmbTentatives;
    }

    public static void afficherRegles() {
        // Codes ANSI
        final String RESET = "\033[0m";
        final String YELLOW = "\033[33m";
        final String BOLD = "\033[1m";     // Gras

        System.out.println(YELLOW+BOLD+"----- RÈGLES DU JEU 'DEVINE LE NOMBRE' -----"+RESET);
        System.out.println(YELLOW+"1. Le but du jeu est de deviner un nombre mystère."+RESET);
        System.out.println(YELLOW+"2. Ce nombre est choisi aléatoirement entre 1 et 100."+RESET);
        System.out.println(YELLOW+"3. À chaque tentative, vous devez entrer un nombre."+RESET);
        System.out.println(YELLOW+"   - Si votre nombre est trop grand, on vous dira 'C'est plus petit !'."+RESET);
        System.out.println(YELLOW+"   - Si votre nombre est trop petit, on vous dira 'C'est plus grand !'."+RESET);
        System.out.println(YELLOW+"4. Continuez jusqu'à trouver le bon nombre."+RESET);
        System.out.println(YELLOW+"5. Le jeu affiche le nombre de tentatives nécessaires pour trouver."+RESET);
        System.out.println(YELLOW+"\nAmusez-vous bien et bonne chance !"+RESET);
        System.out.println(YELLOW+"------------------------------------------"+RESET);
    }

    public static int menu(Scanner my_scan){
        // Codes ANSI
        final String RESET = "\033[0m";
        final String RED = "\033[31m";
        final String YELLOW = "\033[33m";
        final String BLUE = "\033[34m";
        final String BOLD = "\033[1m";     // Gras
        final String UNDERLINE = "\033[4m"; // Souligné

        int choixMenu;

        do {
            System.out.println(BLUE+BOLD+"------------------------"+RESET);
            System.out.println(BLUE+UNDERLINE+"Menu :"+RESET);
            System.out.println(BLUE+"1. Jouer"+RESET);
            System.out.println(BLUE+"2. Afficher les règles"+RESET);
            System.out.println(BLUE+"3. Quitter"+RESET);
            System.out.println(BLUE+BOLD+"------------------------"+RESET);
            System.out.print(YELLOW+"Faites votre choix : "+RESET);
            
            while (!my_scan.hasNextInt()) {
                System.out.println(RED+"Erreur : Veuillez entrer un nombre valide."+RESET);
                my_scan.next(); // Consomme l'entrée invalide
                System.out.print(YELLOW+"Veuillez choisir une option (1, 2 ou 3) : "+RESET);
            }
        
            choixMenu = my_scan.nextInt(); // Lecture du choix utilisateur

            switch (choixMenu) {
                case 1:
                    break;
                case 2:
                    afficherRegles();
                    break;
                case 3:
                    System.out.println(BLUE+"Au revoir !"+RESET);
                    break;
                default:
                    System.out.println(RED+"Choix invalide."+RESET);
            }
        } while (choixMenu != 3 && choixMenu != 1);

        return choixMenu; // Quitte le programme
    }
}