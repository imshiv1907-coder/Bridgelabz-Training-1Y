class CourseFee {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;

        // Calculate discount amount
        double discount = (fee * discountPercent) / 100.0;

        // Calculate fee after discount
        double discountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and the discounted fee to pay is INR " + discountedFee);
    }
}
