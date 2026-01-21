import java.util.Scanner;
public class SquareSide{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read perimeter from user
        System.out.print("Enter the perimeter of the square: ");
        float perimeter = sc.nextFloat();
        // Calculate side
        float side = perimeter / 4;
        // Display result
        System.out.println("The length of the side is " + side 
                + " whose perimeter is " + perimeter);

        sc.close();
    }
}
