import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Input the number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step b: Initialize count
        int count = 0;
        int temp = number; // store original number for display

        // Handle the case when number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Step c: Loop until number != 0
            while (number != 0) {
                // Step d: Remove the last digit
                number /= 10;

                // Step e: Increment count
                count++;
            }
        }

        // Step f: Display the number of digits
        System.out.println("The number " + temp + " has " + count + " digit(s).");

        sc.close();
    }
}
