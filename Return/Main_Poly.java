package Return;

public class Main_Poly {
    public static String verifierAge(int age) {
        if (age < 18) {
            return "Mineur"; // Retourne "Mineur" si age < 18
        } else {
            return "Majeur"; // Retourne "Majeur" sinon
        }
    }

    public static void main(String[] args) {
        System.out.println("Âge 16 : " + verifierAge(16));
        System.out.println("Âge 20 : " + verifierAge(20));
    }
}
