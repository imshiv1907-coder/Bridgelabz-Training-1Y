import java.util.Scanner;

public class IntOperation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input values
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        // Perform integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Display results
        System.out.println("The results of Int Operations are "
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        sc.close();
    }
}
