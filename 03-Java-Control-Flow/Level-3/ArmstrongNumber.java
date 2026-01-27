import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a & b: Input the number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        int sum = 0; // to store sum of cubes of digits
        int originalNumber = number; // keep the original number

        // Step c: Use while loop till originalNumber != 0
        while (originalNumber != 0) {
            // Step d: Get last digit
            int digit = originalNumber % 10;

            // Find cube of digit and add to sum
            sum += digit * digit * digit;

            // Step e: Remove the last digit
            originalNumber /= 10;
        }

        // Step f: Check if sum equals original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
