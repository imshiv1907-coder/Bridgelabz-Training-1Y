class Product<T> {
    T category;
    double price;

    Product(T c, double p) {
        category = c;
        price = p;
    }
}

class Discount {
    static <T extends Product<?>> void applyDiscount(T p, double percent) {
        p.price -= p.price * percent / 100;
    }
}