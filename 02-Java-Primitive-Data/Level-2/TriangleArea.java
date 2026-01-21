import java.util.Scanner;
public class TriangleArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input in centimeters
        System.out.print("Enter the base in cm: ");
        float base = sc.nextFloat();

        System.out.print("Enter the height in cm: ");
        float height = sc.nextFloat();
        // Area in square centimeters
        float areaSqCm = 0.5f * base * height;
        // Convert to square inches
        float areaSqIn = areaSqCm / (2.54f * 2.54f);
        // Display the result
        System.out.println("The Area of the triangle in sq in is " 
                + areaSqIn + " and sq cm is " + areaSqCm);

        sc.close();
    }
}
