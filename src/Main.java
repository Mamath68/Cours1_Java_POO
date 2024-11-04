import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 37;
        double poids = 3.5;
        boolean isFemale = true;
        String prenom = "Jeanne";

        System.out.println("Bonjours tout le monde, je m'appelle " + prenom);
        System.out.println("J'ai " + age + " ans");
        System.out.println("Je pèse " + poids + "kg");
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Quel age avec vous ?: ");
        int age2 = scan.nextInt();
        System.out.println("J'ai " + age2 + " ans");

        int a = 5;
        int b = 6;

        if (a < b) {
            System.out.println("a est plus petit que b");
        } else if (a > b) {
            System.out.println("a est plus grand que b");
        } else {
            System.out.println("a est égale à b");
        }
    }
}