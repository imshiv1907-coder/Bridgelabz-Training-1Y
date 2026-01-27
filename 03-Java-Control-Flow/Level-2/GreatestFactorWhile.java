import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int greatestFactor = 1; // initialize greatest factor
            int counter = number - 1; // start checking from number-1

            // Loop while counter >= 1
            while (counter >= 1) {
                if (number % counter == 0) { // check if counter is a factor
                    greatestFactor = counter;
                    break; // stop at the largest factor
                }
                counter--; // decrement counter
            }

            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }

        sc.close();
    }
}
