import java.util.Scanner;

public class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (non-negative integer): ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Please enter a non-negative integer for the power.");
        } else {
            long result = 1; // initialize result
            int counter = 0; // initialize counter

            // Loop until counter == power
            while (counter < power) {
                result *= number; // multiply result by number
                counter++;        // increment counter
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
