import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        // → PARTIE : VARIABLES ET PRINT

        //int age = 26;
        //double weight = 3.5;
        //boolean isFemale = true;
        //String firstName = "Dédé";

        // → println = print puis va à la ligne
        // → print = print mais ne retourne pas à la ligne

        //System.out.println("Hello World!"); //print "Hello World"
        //System.out.println("Bonjour tout le monde, je suis " + firstName);
        //System.out.println("J'ai " + age + " ans.");
        //System.out.println("Mon poids est de "  + weight + "kg.");

        // → PARTIE : SAISIT

        // → Demander à l'utilisateur de saisir son âge
        //Scanner scan = new Scanner(System.in);
        //System.out.print("Entrez votre âge : ");
        //int age2 = scan.nextInt();
        //System.out.println("J'ai " + age2 + " ans.");
        //scan.close();

        // → PARTIE : CONDITION

        //int a = 5;
        //int b = 2;
        //boolean test = true;
        //if (a < b && test) {
        //System.out.println("a est plus petit que b");
        //} else if (a > b) {
        //System.out.println("a est plus grand que a");
        //} else {
        //System.out.println("a est égale à b");
        //}

        // → PARTIE : TEST 1

        int userAge;

        Scanner askAge = new Scanner(System.in);
        System.out.println("Entrez votre age :");
        userAge = askAge.nextInt();
        System.out.println("Vous avez " + userAge + " ans.");

        if (userAge == 18) {
            System.out.println("Vous avez l'âge de la majorité");
        }
        if (userAge < 18) {
            System.out.println("Vous êtes mineur !");
        }
        if (userAge > 18) {
            System.out.println("Vous êtes majeur !");
        }

        // → PARTIE : BOUCLE AVEC FOR

        //for (int i = 0; i < 10; i+=2) {
        //System.out.println(i);
        //}

        //for (int i = 0; i < 10; i++) {
        //for (int j = 0; j < 10; j++) {
        //System.out.println(i + " " + j);
        //}
        //}

        // → PARTIE : TEST 2 (de 00:00:00 à 23:59:59)

        //for (int i = 0; i < 24; i++) {
        //for (int j = 0; j < 60; j++) {
        //for (int k = 0; k < 60; k++) {
        //System.out.println(i+":"+j+":"+k);
        //}
        //}
        //}

        /* for (int heure = 0; heure < 24; heure++) {
            for (int ms = 0; ms < 3600; ms++) {
                int m = ms / 60;
                int s = ms % 60;
                System.out.println(heure+":"+m+":"+s);
            }
        }*/
    }
}