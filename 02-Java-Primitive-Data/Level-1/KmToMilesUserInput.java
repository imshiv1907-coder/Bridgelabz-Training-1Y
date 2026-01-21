import java.util.Scanner;

class KmToMilesUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble(); // Read user input

        double miles = km / 1.6; // Convert km to miles

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        input.close(); // Close the Scanner
    }
}
