import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();

        if (number < 0) { // check for non-negative integer
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // use long for larger results

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " is " + factorial);
        }

        sc.close();
    }
}
