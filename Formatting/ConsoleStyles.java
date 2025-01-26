package Formatting;

public class ConsoleStyles {
    public static void main(String[] args) {
        // Codes ANSI pour les styles
        final String RESET = "\033[0m";    // Réinitialiser tout
        final String BOLD = "\033[1m";     // Gras
        final String UNDERLINE = "\033[4m"; // Souligné
        final String RED = "\033[31m";     // Rouge
        final String GREEN = "\033[32m";   // Vert

        // Texte en gras
        System.out.println(BOLD + "Ceci est un texte en gras." + RESET);

        // Texte en gras et rouge
        System.out.println(BOLD + RED + "Ceci est un texte rouge en gras." + RESET);

        // Texte souligné
        System.out.println(UNDERLINE + "Ceci est un texte souligné." + RESET);

        // Texte souligné, gras et vert
        System.out.println(BOLD + UNDERLINE + GREEN + "Texte vert en gras et souligné." + RESET);
    }
}
