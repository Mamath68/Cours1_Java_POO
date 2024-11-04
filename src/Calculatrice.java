import java.util.Scanner;

/*
 * Afficher un menu qui propose d'additionner(1), soustraire (2), multiplier (3); diviser (4), quitter (5)
 * Ecrire des fonctions qui exécutent des 5 actions possibles + une fonction d'affichage a la fin de chaque opération (sauf la 5ème), retourner le menu
 *
 */
public class Calculatrice {
    public static void main(String[] args) {

        afficher_menu();
        int option = demandeSaisieUtilisateur();
        switch (option) {
            case 1:
               addition();
            case 2:
                soustraction();
            case 3:
                multiplication();
            case 4:
                division();
            case 5:
                quitter();
        }
    }

    private static void afficher_menu() {
        System.out.print("Bonjour, choisissez une des options suivantes:");
        System.out.print("Addition(1)");
        System.out.print("Soustraction(2)");
        System.out.print("Multiplication(3)");
        System.out.print("Division(4)");
        System.out.print("Retour(5)");
    }

    private static int demandeSaisieUtilisateur() {
        Scanner input = new Scanner(System.in);

        return input.nextInt();
    }

    private static void afficher() {
    }

    public static int addition() {

        Scanner input = new Scanner(System.in);
        int entier1 = input.nextInt();
        int entier2 = input.nextInt();

        return entier1 + entier2;
    }

    private static double division() {
        Scanner input = new Scanner(System.in);
        double entier1 = input.nextInt();
        double entier2;
        do {
            entier2 = input.nextInt();
        } while (entier2 == 0);

        return (entier1 / entier2);
    }

    private static int multiplication() {
        Scanner input = new Scanner(System.in);
        int entier1 = input.nextInt();
        int entier2 = input.nextInt();

        return entier1 * entier2;
    }

    private static int soustraction() {
        Scanner input = new Scanner(System.in);
        int entier1 = input.nextInt();
        int entier2 = input.nextInt();

        return entier1 - entier2;
    }

    private static void quitter() {
    }
}