class Personne {
    String nom, prenom;
    int age;
    String sexe;
    String Lieu_Naissance;

    public void sePresenter() {
        System.out.println("Bonjour, je m'appelle "+prenom+" "+nom+", j'ai "+age+" ans. \nMon genre est définit par ça '"+sexe+"' et je suis né à "+Lieu_Naissance+".");
    }
}

public class Main_POO {
    public static void main(String[] args){
        Personne p = new Personne();
        p.nom = "Ligny";
        p.prenom = "Martin";
        p.age = 21;
        p.sexe = "Homme";
        p.Lieu_Naissance = "Amiens";

        p.sePresenter();
    }
}
