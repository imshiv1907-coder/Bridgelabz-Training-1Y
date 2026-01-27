import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter the salary of the employee: ");
        double salary = sc.nextDouble();

        // Input years of service
        System.out.print("Enter the years of service: ");
        int yearsOfService = sc.nextInt();

        double bonus = 0.0;

        // Check if employee is eligible for bonus
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        System.out.println("The bonus amount is: " + bonus);

        sc.close();
    }
}
