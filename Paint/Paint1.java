import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
            System.out.println("Enter wall height (feet): ");
            //checks if entered height is a double
            if (!scnr.hasNextDouble()) {
                System.out.println("Invalid input.  Height must be a decimal.");
                scnr.next();
                continue;
            }
            wallHeight = scnr.nextDouble();
            //checks if entered height is a positive double
            if (wallHeight <= 0.0) {
                System.out.println("Invalid input.  Height must be a positive number.");
                continue;
            }
            else {
                break;
            }
        } while (true);

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
            System.out.println("Enter wall width (feet): ");
            //checks if entered width is a double
            if (!scnr.hasNextDouble()) {
                System.out.println("Invalid input.  Width must be a decimal.");
                scnr.next();
                continue;
            }
            wallWidth = scnr.nextDouble();
            //checks if entered width is a positive double
            if (wallWidth <= 0.0) {
                System.out.println("Invalid input.  Width must be a positive number.");
                continue;
            }
            else {
                break;
            }
        } while (true);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}
