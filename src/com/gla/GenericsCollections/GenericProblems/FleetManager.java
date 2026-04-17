import java.util.*;

class Vehicle {}
class Truck extends Vehicle {}
class Bike extends Vehicle {}

class FleetManager<T extends Vehicle> {
    List<T> fleet = new ArrayList<>();

    void addVehicle(T v) {
        fleet.add(v);
    }

    void showFleet() {
        System.out.println(fleet);
    }
}