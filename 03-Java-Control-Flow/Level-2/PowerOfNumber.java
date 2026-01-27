import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Please enter a non-negative integer for the power.");
        } else {
            long result = 1; // initialize result

            // Loop to multiply number power times
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
