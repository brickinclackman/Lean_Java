package Exercices;

import java.util.Scanner;

public class Dmd_Age_return {
    public static void Min_or_Maj(int age){
        if(age < 18){
            System.out.println("Vous êtes mineur !");
        }
        else{
            System.out.println("Vous êtes majeur !");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer votre âge : ");
        //int age = scanner.nextInt();
        Min_or_Maj(scanner.nextInt());

        scanner.close();
    }
}
