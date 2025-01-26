package Return;

public class Main_bool {
    public static boolean estPair(int nombre) {
        return nombre % 2 == 0; // Retourne vrai si le nombre est pair
    }

    public static void main(String[] args) {
        System.out.println("4 est pair ? " + estPair(4));
    }
}
