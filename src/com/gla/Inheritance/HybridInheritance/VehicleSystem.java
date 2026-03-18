
class Vehicle
{
    int maxSpeed;
    String fuelType;

    void displayInfo()
    {
        System.out.println("Speed: "+maxSpeed);
        System.out.println("Fuel: "+fuelType);
    }
}

class Car extends Vehicle
{
    int seatCapacity;

    void displayInfo()
    {
        System.out.println("Car Info");
        System.out.println("Seats: "+seatCapacity);
    }
}

class Truck extends Vehicle
{
    int loadCapacity;

    void displayInfo()
    {
        System.out.println("Truck Load: "+loadCapacity);
    }
}

class Motorcycle extends Vehicle
{
    int engineCC;

    void displayInfo()
    {
        System.out.println("Motorcycle Engine: "+engineCC+"cc");
    }
}

public class VehicleSystem
{
    public static void main(String args[])
    {
        Vehicle v[] = new Vehicle[3];

        v[0] = new Car();
        v[1] = new Truck();
        v[2] = new Motorcycle();

        v[0].displayInfo();
        v[1].displayInfo();
        v[2].displayInfo();
    }
}
