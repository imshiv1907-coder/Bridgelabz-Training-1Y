import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // --- Approach 1: Using multiple if-else statements ---
        if (year < 1582) {
            System.out.println("Leap year calculation only works for year >= 1582.");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year (divisible by 400).");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap Year (divisible by 100 but not 400).");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year (divisible by 4 but not 100).");
        } else {
            System.out.println(year + " is NOT a Leap Year (not divisible by 4).");
        }

        // --- Approach 2: Using a single if statement with logical operators ---
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year (checked using logical operators).");
        } else if (year >= 1582) {
            System.out.println(year + " is NOT a Leap Year (checked using logical operators).");
        }

        sc.close();
    }
}
