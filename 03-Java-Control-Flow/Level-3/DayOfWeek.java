import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input month, day, year
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();

        System.out.print("Enter year (e.g., 2026): ");
        int y = sc.nextInt();

        // Step 2: Compute y0
        int y0 = y + (-(14 - m) / 12);

        // Step 3: Compute x
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);

        // Step 4: Compute m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Step 5: Compute d0 (day of week, 0 = Sunday)
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Step 6: Print the result
        System.out.println("Day of week (0=Sunday ... 6=Saturday): " + d0);
    }
}
