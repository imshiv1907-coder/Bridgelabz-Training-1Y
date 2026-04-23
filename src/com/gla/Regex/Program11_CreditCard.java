public class Program11_CreditCard {
    public static void main(String[] args) {
        String card = "4123456789123456";
        System.out.println(card.matches("^(4|5)\\d{15}$"));
    }
}