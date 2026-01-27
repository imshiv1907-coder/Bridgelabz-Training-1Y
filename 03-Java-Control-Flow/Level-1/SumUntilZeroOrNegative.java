import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;  // to store the sum
        double number;       // to store user input

        System.out.println("Enter numbers to sum (enter 0 or negative number to stop):");

        while (true) {
            number = sc.nextDouble();

            // If number is 0 or negative, exit the loop
            if (number <= 0) {
                break;
            }

            total += number; // add input to total
        }

        System.out.println("The total sum is: " + total);
        sc.close();
    }
}
