import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int greatestFactor = 1; // initialize greatest factor

            // Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) { // check if i is a factor
                    greatestFactor = i;
                    break; // stop at the largest factor
                }
            }

            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }

        sc.close();
    }
}
