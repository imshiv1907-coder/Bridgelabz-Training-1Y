import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) { // check for positive integer
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1; // start from 1
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; // increment counter
            }
        }

        sc.close();
    }
}
