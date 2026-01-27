import java.util.Scanner;

public class FactorsOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) { // check for positive integer
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            
            int i = 1; // counter variable
            while (i <= number) { // loop until i <= number
                if (number % i == 0) { // check if i is a factor
                    System.out.println(i);
                }
                i++; // increment counter
            }
        }

        sc.close();
    }
}
