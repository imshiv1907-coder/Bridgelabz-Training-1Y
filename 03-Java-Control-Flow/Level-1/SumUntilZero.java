import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0; 
        double number;    \

        System.out.println("Enter numbers to sum (enter 0 to stop):");

        // Keep asking user until 0 is entered
        while (true) {
            number = sc.nextDouble();

            if (number == 0) {
                break; // exit loop if 0 is entered
            }

            total += number; // add input to total
        }

        System.out.println("The total sum is: " + total);
        sc.close();
    }
}
