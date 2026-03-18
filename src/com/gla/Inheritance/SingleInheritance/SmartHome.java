class Device
{
    int deviceId;
    String status;

    void displayStatus()
    {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device
{
    int temperatureSetting;

    void displayStatus()
    {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHome
{
    public static void main(String[] args)
    {
        Thermostat t = new Thermostat();

        t.deviceId = 101;
        t.status = "ON";
        t.temperatureSetting = 24;

        t.displayStatus();
    }
}