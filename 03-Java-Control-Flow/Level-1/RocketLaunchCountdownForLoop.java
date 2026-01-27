import java.util.Scanner;

public class RocketLaunchCountdownForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: starting number for countdown
        System.out.print("Enter the starting number for countdown: ");
        int counter = sc.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Lift off!");
        sc.close();
    }
}
