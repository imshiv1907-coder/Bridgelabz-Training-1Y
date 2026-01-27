import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // b. Get input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int originalNumber = number; // store original value
        int sum = 0;                 // c. initialize sum

        // d. While loop to access each digit
        while (number != 0) {
            // e. Get last digit and add to sum
            int digit = number % 10;
            sum += digit;

            // Remove last digit
            number /= 10;
        }

        // f & g. Check Harshad condition
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
