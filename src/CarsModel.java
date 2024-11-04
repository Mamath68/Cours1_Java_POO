import java.util.ArrayList;
import java.util.Scanner;

public class CarsModel {
    public static void main(String[] args) {
        // Déclarer et instancier un objet de type ArrayList pour stocker des marques de voitures
        ArrayList<String> marquesVoitures = new ArrayList<>();

        // Déclarer et instancier un objet de type Scanner pour lire les entrées utilisateur
        Scanner input = new Scanner(System.in);

        // Déclaration de 3 variables de type String pour les noms des marques
        String marque1, marque2, marque3;

        // Demander à l'utilisateur de donner un nom de marque de voiture pour chaque variable
        System.out.print("Entrez le nom de la première marque de voiture : ");
        marque1 = input.nextLine();

        System.out.print("Entrez le nom de la deuxième marque de voiture : ");
        marque2 = input.nextLine();

        System.out.print("Entrez le nom de la troisième marque de voiture : ");
        marque3 = input.nextLine();

        // Ajouter les marques de voiture à l'ArrayList
        marquesVoitures.add(marque1);
        marquesVoitures.add(marque2);
        marquesVoitures.add(marque3);

        // Supprimer la deuxième marque de voiture (à l'index 1) de l'ArrayList
        marquesVoitures.remove(1);

        // Afficher la marque de voiture présente dans la première cellule de l'ArrayList
        System.out.println("La marque de voiture dans la première cellule est : " + marquesVoitures.getFirst());
    }
}
