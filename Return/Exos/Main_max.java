package Return.Exos;

public class Main_max {
    public static int max(int a, int b) {
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args){
        System.out.println("Voici le max entre 1 et 100 : "+max(1,100));
    }
}
