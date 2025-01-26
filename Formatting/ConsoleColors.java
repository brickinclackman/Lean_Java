package Formatting;

public class ConsoleColors {
    public static void main(String[] args) {
        // Codes ANSI
        final String RESET = "\033[0m";
        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        final String YELLOW = "\033[33m";
        final String BLUE = "\033[34m";

        // Utilisation des couleurs
        System.out.println(RED + "Ceci est un texte rouge !" + RESET);
        System.out.println(GREEN + "Ceci est un texte vert !" + RESET);
        System.out.println(YELLOW + "Ceci est un texte jaune !" + RESET);
        System.out.println(BLUE + "Ceci est un texte bleu !" + RESET);

        // Mélanger les couleurs et formater
        System.out.println(BLUE + "Texte bleu " + YELLOW + "avec du jaune !" + RESET);
    }
}
