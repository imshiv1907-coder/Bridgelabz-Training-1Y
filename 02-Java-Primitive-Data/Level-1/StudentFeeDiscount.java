import java.util.Scanner;

class StudentFeeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        // Take user input for fee
        System.out.print("Enter the student fee in INR: ");
        double fee = input.nextDouble();

        // Take user input for discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount amount
        double discount = (fee * discountPercent) / 100.0;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        // Display results
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        input.close(); // Close Scanner
    }
}
