import java.util.Scanner;
public class DistanceConversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input distance in feet
        System.out.print("Enter the distance in feet: ");
        float distanceInFeet = sc.nextFloat();
        // Convert feet to yards
        float distanceInYards = distanceInFeet / 3;
        // Convert yards to miles
        float distanceInMiles = distanceInYards / 1760;
        // Display the result
        System.out.println("The distance in yards is " + distanceInYards
                + " while the distance in miles is " + distanceInMiles);

        sc.close();
    }
}
