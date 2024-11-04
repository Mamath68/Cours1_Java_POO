import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quel age avec vous ?: ");
        int age = scan.nextInt();
        System.out.println("J'ai " + age + " ans");

        if (age >= 18) {
            System.out.println("Vous êtes majeur, vive la fiesta et la binouse");
        }  else {
            System.out.println("Va falloir attendre, t'est pas majeur encore");
        }
    }
}
