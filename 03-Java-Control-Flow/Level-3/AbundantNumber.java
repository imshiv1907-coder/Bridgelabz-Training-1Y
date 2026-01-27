import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum of divisors
        int sum = 0;

        // Step 3: Loop to find all divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // Step 4: Add divisor to sum
            }
        }

        // Step 5: Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
    }
}