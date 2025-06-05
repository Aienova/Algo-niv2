package Intro;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Date {
    public static void main(String[] args) {


        // Format de base des dates YYYY-MM-DD
        // Exemple : 2025-05-21

        try{
        // Current date and time
        LocalDateTime now = LocalDateTime.now();

        // Define a formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM-yyyy HH:mm:ss");
        // Print the current date and time
        
                System.out.println(now);

        // y: Année, M: Mois, d: Jour, H: Heure (24h), m: Minute, s: Seconde

        // Format the date-time
        String formattedDate = now.format(formatter);
        System.out.println("Date d'aujourd'hui format Francophone: " + formattedDate);

        // Parse a string back to LocalDateTime
        String dateTimeString = "21/05/2025 14:30:00";
        LocalDateTime parsedDate = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("Conversion de date String en LocalDateTime: " + parsedDate);
    }
        catch(DateTimeParseException e){
            System.out.println("Erreur de formatage de la date : ");
        }

         System.out.println("Continuer le code ! ");


    }
}