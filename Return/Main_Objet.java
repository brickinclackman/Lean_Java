package Return;

public class Main_Objet {
    public static String direBonjour(String nom) {
        return "Bonjour, " + nom + " !";
    }

    public static void main(String[] args) {
        String message = direBonjour("Martin");
        System.out.println(message);
    }
}
