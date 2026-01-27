import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // b. Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        // Display BMI value
        System.out.println("BMI value is: " + bmi);

        // c. Determine weight status using BMI table
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }

        sc.close();
    }
}
