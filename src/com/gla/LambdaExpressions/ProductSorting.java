import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | ₹" + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class ProductSorting {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Laptop", 70000, 4.5, 10),
            new Product("Phone", 30000, 4.7, 15),
            new Product("Headphones", 2000, 4.2, 25)
        );

        Comparator<Product> sortByRating =
            Comparator.comparing((Product p) -> p.rating).reversed();

        List<Product> sorted = new ArrayList<>(products);
        sorted.sort(sortByRating);

        sorted.forEach(System.out::println);
    }
}