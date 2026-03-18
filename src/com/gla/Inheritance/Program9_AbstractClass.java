abstract class Shape {
    abstract void draw();
    void display() {
        System.out.println("Shape display");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.display();
    }
}