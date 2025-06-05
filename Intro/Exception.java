package Intro;

import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

public class Exception {
    public static void main(String[] args) {
        // Exemple de gestion d'exception


        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre pour le diviseur : ");
        int diviseur = scanner.nextInt();
        System.out.println("Entrez un nombre pour le dividende : ");
        int dividende = scanner.nextInt();


            int result = dividende / diviseur;
            System.out.println("Result: " + result);
        
    }


}
