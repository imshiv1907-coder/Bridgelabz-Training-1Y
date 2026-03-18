class Base {
    void display() {
        System.out.println("Base display");
    }
}
class Derived extends Base {}
public class Program15_FragileBase {
    public static void main(String[] args) {
        new Derived().display();
    }
}