import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter a number greater than 1: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Number must be greater than 1 to check for prime.");
        } else {
            boolean isPrime = true; // assume number is prime

            // Check divisibility from 2 to number-1
            for (int i = 2; i <= number / 2; i++) { // checking up to number/2 is sufficient
                if (number % i == 0) {
                    isPrime = false; // number is divisible by i, not prime
                    break;           // exit the loop
                }
            }

            // Output result
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is NOT a Prime Number.");
            }
        }

        sc.close();
    }
}
