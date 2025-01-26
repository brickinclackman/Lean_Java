package Return;

public class Main_Without {
    public static void afficherMessage(String message) {
        if (message == null) {
            System.out.println("Message vide.");
            return; // Sortie de la méthode
        }
        System.out.println("Message : " + message);
    }

    public static void main(String[] args) {
        afficherMessage(null); // Appelle la méthode avec un message null
        afficherMessage("Salut tout le monde !");
    }
}