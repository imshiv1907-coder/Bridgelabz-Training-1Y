class Engine {
    void start() {
        System.out.println("Engine started");
    }
}
class Car {
    private Engine engine = new Engine();
    void startCar() {
        engine.start();
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.startCar();
    }
}