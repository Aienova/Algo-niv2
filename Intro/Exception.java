package Intro;

public class Exception {
    public static void main(String[] args) {
        // Exemple de gestion d'exception
        try {
            int result = 10/0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro non autorisée.");
        }
    }


}
