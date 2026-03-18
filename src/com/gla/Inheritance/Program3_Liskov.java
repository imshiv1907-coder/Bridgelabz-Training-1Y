class Bird {
    void fly() {
        System.out.println("Flying");
    }
}
class Sparrow extends Bird {}
public class Program3_Liskov {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.fly();
    }
}