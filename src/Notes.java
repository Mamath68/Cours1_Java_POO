import java.util.Scanner;
/*
 * Faire un programme qui :
 * Demande à un professeur le nombre d’élèves qu’il a dans sa classe
 * Créer un tableau adapté
 * Demander les notes une par une afin de les rentrer dans le tableau
 * afficher à la fin la moyenne des notes du tableau.
 */

public class Notes {
    public static void main(String[] args) {
        // Création d’un scanner pour lire les entrées utilisateur
        Scanner input = new Scanner(System.in);

        // Demande à l'utilisateur le nombre d’élèves dans la classe
        System.out.print("Entrez le nombre d'élèves dans la classe : ");

        // Récupération du nombre d’élèves saisi par l'utilisateur
        int nombreEleves = input.nextInt();

        // Création d’un tableau pour stocker les notes des élèves
        double[] notes = new double[nombreEleves];
        double somme = 0; // Initialisation de la variable pour la somme des notes

        // Boucle pour demander et stocker la note de chaque élève
        for (int i = 0; i < nombreEleves; i++) {
            System.out.print("Entrez la note de l'élève " + (i + 1) + " : ");

            // Saisie de la note et ajout au tableau
            notes[i] = input.nextDouble();

            // Ajout de la note à la somme totale
            somme += notes[i];
        }

        // Calcul de la moyenne des notes
        double moyenne = somme / nombreEleves;

        // Affichage de la moyenne avec deux chiffres après la virgule
        System.out.printf("La moyenne de la classe est : %.2f\n", moyenne);
    }
}