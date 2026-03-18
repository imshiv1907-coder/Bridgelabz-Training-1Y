class Vehicle
{
    int maxSpeed;
    String fuelType;

    Vehicle(int s,String f)
    {
        maxSpeed = s;
        fuelType = f;
    }

    void displayInfo()
    {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle
{
    int seatCapacity;

    Car(int s,String f,int c)
    {
        super(s,f);
        seatCapacity = c;
    }

    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle
{
    int loadCapacity;

    Truck(int s,String f,int l)
    {
        super(s,f);
        loadCapacity = l;
    }

    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

class Motorcycle extends Vehicle
{
    String type;

    Motorcycle(int s,String f,String t)
    {
        super(s,f);
        type = t;
    }

    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}

public class VehicleTest
{
    public static void main(String args[])
    {
        Vehicle v[] = new Vehicle[3];

        v[0] = new Car(180,"Petrol",5);
        v[1] = new Truck(120,"Diesel",2000);
        v[2] = new Motorcycle(150,"Petrol","Sports");

        for(int i=0;i<3;i++)
        {
            v[i].displayInfo();
            System.out.println();
        }
    }
}