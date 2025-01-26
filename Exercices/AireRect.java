package Exercices;

class Rectangle{
    int Longueur,largeur;

    public int CalculAire(int Longueur, int largeur){
        int Aire = Longueur*largeur;
        return Aire;
    }
}

public class AireRect {
    public static void main(String[] args){
        Rectangle Rect1 = new Rectangle();
        int AireRectInt = Rect1.CalculAire(2,3);
        System.out.println("Aire du rectangle : "+AireRectInt);
    }
}
