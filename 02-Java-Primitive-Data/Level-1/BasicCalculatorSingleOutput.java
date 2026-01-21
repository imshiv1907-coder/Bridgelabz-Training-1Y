import java.util.Scanner;

class BasicCalculatorSingleOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN; // Handle division by zero

        // Print all results in a single statement
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                            + number1 + " and " + number2 + " is " 
                            + addition + ", " 
                            + subtraction + ", " 
                            + multiplication + ", and " 
                            + (number2 != 0 ? division : "Cannot divide by zero"));

        input.close(); // Close Scanner
    }
}
