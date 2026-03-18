abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }
    public static void main(String[] args) {
        new Car().start();
    }
}